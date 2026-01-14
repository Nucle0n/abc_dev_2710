package exocoursfranck;

import java.util.Scanner;

public class ZoneDeJeuDamier {

    // ================= CONFIGURATION =================

    static final int BASE_HEIGHT = 10;
    static final int SCALE = 3;
    static final int HEIGHT = BASE_HEIGHT * SCALE;
    static final int WIDTH  = HEIGHT * 2;

    // Fond sable
    static final String BG_SAND = "\033[48;2;235;216;170m";

    // Mur (brun / gris-brun)
    static final String BG_WALL = "\033[48;2;120;90;60m";

    // Texture sable (variation légère)
    static final String FG_SAND_DARK  = "\033[38;2;255;235;129m";
    static final String FG_SAND_LIGHT = "\033[38;2;255;242;172m";
    static final String RESET = "\033[0m";
    
    static String playerName;

    // ================= MAIN =================

    public static void main(String[] args) {
        showTitleScreen();
        askPlayerName();
        drawZone();
    }

    // ================= ÉCRAN TITRE =================

    static void showTitleScreen() {
        clearScreen();

        String[] title = {
            "  █████████  ██████   █████   █████████   █████   ████ ██████████",
            " ███▒▒▒▒▒███▒▒██████ ▒▒███   ███▒▒▒▒▒███ ▒▒███   ███▒ ▒▒███▒▒▒▒▒█",
            "▒███    ▒▒▒  ▒███▒███ ▒███  ▒███    ▒███  ▒███  ███    ▒███  █ ▒ ",
            "▒▒█████████  ▒███▒▒███▒███  ▒███████████  ▒███████     ▒██████   ",
            " ▒▒▒▒▒▒▒▒███ ▒███ ▒▒██████  ▒███▒▒▒▒▒███  ▒███▒▒███    ▒███▒▒█   ",
            " ███    ▒███ ▒███  ▒▒█████  ▒███    ▒███  ▒███ ▒▒███   ▒███ ▒   █",
            "▒▒█████████  █████  ▒▒█████ █████   █████ █████ ▒▒████ ██████████",
            " ▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒    ▒▒▒▒▒ ▒▒▒▒▒   ▒▒▒▒▒ ▒▒▒▒▒   ▒▒▒▒ ▒▒▒▒▒▒▒▒▒▒  "
        };

        for (String line : title) {
            System.out.println(line);
        }

        System.out.println();
        System.out.println("            ── Appuyez sur Entrée pour continuer ──");
        waitForEnter();
    }

    static void askPlayerName() {
        clearScreen();
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        NOM DU JOUEUR         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.print("> ");

        playerName = sc.nextLine().trim();
        if (playerName.isEmpty()) {
            playerName = "Joueur";
        }

        // pas de close ici si plus tard on veut réutiliser System.in
    }

    static void waitForEnter() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    // ================= JEU (ZONE) =================

    static void drawZone() {
        clearScreen();

        System.out.println("Joueur : " + playerName);
        System.out.println();

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {

                boolean wallHorizontal = (y == 0 || y == HEIGHT - 1);
                boolean wallVertical   = (x == 0 || x == 1 || x == WIDTH - 2 || x == WIDTH - 1);

                if (wallHorizontal || wallVertical) {
                    System.out.print(BG_WALL + " ");
                } else {
                    boolean light = ((x / 2) + y) % 2 == 0;
                    String fg = light ? FG_SAND_LIGHT : FG_SAND_DARK;
                    System.out.print(BG_SAND + fg + '░');
                }
            }
            System.out.println(RESET);
        }
    }

    // ================= OUTILS =================

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}