package exocoursfranck;

import java.io.*;
import java.util.*;

public class SnakeConsole {

    // Taille du plateau
    static final int WIDTH = 30;
    static final int HEIGHT = 15;

    // Jeu
    static LinkedList<int[]> snake = new LinkedList<>();
    static int foodX, foodY;
    static volatile int dx = 1, dy = 0;
    static volatile boolean running = true;
    static int score = 0;

    // Joueur & scores
    static String playerName;
    static final String SCORE_FILE = "score.log";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        showScores();

        System.out.print("Entrez votre nom : ");
        playerName = sc.nextLine().trim();
        if (playerName.isEmpty()) {
            playerName = "Joueur";
        }

        initGame();

        Thread inputThread = new Thread(SnakeConsole::handleInput);
        inputThread.setDaemon(true);
        inputThread.start();

        while (running) {
            move();
            draw();
            Thread.sleep(300);
        }

        saveScore();

        System.out.println("Game Over !");
        System.out.println(playerName + ", votre score : " + score);

        sc.close();
    }

    // ---------------- INIT ----------------

    static void initGame() {
        snake.clear();
        snake.add(new int[]{WIDTH / 2, HEIGHT / 2});
        score = 0;
        placeFood();
    }

    static void placeFood() {
        Random rand = new Random();
        while (true) {
            foodX = rand.nextInt(WIDTH - 2) + 1;
            foodY = rand.nextInt(HEIGHT - 2) + 1;

            boolean onSnake = false;
            for (int[] p : snake) {
                if (p[0] == foodX && p[1] == foodY) {
                    onSnake = true;
                    break;
                }
            }
            if (!onSnake) break;
        }
    }

    // ---------------- JEU ----------------

    static void move() {
        int[] head = snake.getFirst();
        int newX = head[0] + dx;
        int newY = head[1] + dy;

        // Collision murs
        if (newX <= 0 || newX >= WIDTH - 1 || newY <= 0 || newY >= HEIGHT - 1) {
            running = false;
            return;
        }

        // Collision avec soi-même
        for (int[] p : snake) {
            if (p[0] == newX && p[1] == newY) {
                running = false;
                return;
            }
        }

        snake.addFirst(new int[]{newX, newY});

        // Nourriture
        if (newX == foodX && newY == foodY) {
            score++;
            placeFood();
        } else {
            snake.removeLast();
        }
    }

    // ---------------- CLAVIER ----------------

    static void handleInput() {
        Scanner sc = new Scanner(System.in);

        while (running) {
            String input = sc.nextLine().toLowerCase();
            if (input.isEmpty()) continue;

            char c = input.charAt(0);
            switch (c) {
                case 'z':
                case 'w':
                    if (dy != 1) { dx = 0; dy = -1; }
                    break;
                case 's':
                    if (dy != -1) { dx = 0; dy = 1; }
                    break;
                case 'q':
                case 'a':
                    if (dx != 1) { dx = -1; dy = 0; }
                    break;
                case 'd':
                    if (dx != -1) { dx = 1; dy = 0; }
                    break;
                case 'x':
                    running = false;
                    break;
            }
        }

        sc.close();
    }

    // ---------------- AFFICHAGE ----------------

    static void draw() {
        clearScreen();
        char[][] grid = new char[HEIGHT][WIDTH];

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == 0 || x == WIDTH - 1 || y == 0 || y == HEIGHT - 1)
                    grid[y][x] = '#';
                else
                    grid[y][x] = ' ';
            }
        }

        grid[foodY][foodX] = '*';

        boolean head = true;
        for (int[] p : snake) {
            grid[p[1]][p[0]] = head ? 'O' : 'o';
            head = false;
        }

        for (int y = 0; y < HEIGHT; y++) {
            System.out.println(grid[y]);
        }

        System.out.println("Joueur : " + playerName + " | Score : " + score);
        System.out.println("Commandes : ZQSD / WASD + Entrée | X = quitter");
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // ---------------- SCORES ----------------

    static void saveScore() {
        try (FileWriter fw = new FileWriter(SCORE_FILE, true)) {
            fw.write(playerName + " : " + score + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Erreur lors de l'enregistrement du score.");
        }
    }

    static void showScores() {
        File file = new File(SCORE_FILE);
        if (!file.exists()) return;

        System.out.println("=== Scores enregistrés ===");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Impossible de lire les scores.");
        }
        System.out.println("==========================");
    }
}
