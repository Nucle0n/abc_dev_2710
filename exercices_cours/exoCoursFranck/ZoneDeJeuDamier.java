package excoursfranck;
 
public class ZoneDeJeuDamier {
 
    // Taille de base
    static final int BASE_HEIGHT = 10;
 
    // Multiplicateur (2 ou 3)
    static final int SCALE = 3;
 
    static final int HEIGHT = BASE_HEIGHT * SCALE;
    static final int WIDTH  = HEIGHT * 2;
 
    // Couleurs ANSI (fond)
    static final String BG_LIGHT = "\033[48;2;200;200;200m"; // gris clair
    static final String BG_DARK  = "\033[48;2;150;150;150m"; // gris foncé
 
    // Mur (brun / gris-brun)
    static final String BG_WALL  = "\033[48;2;120;90;60m";
 
    static final String RESET = "\033[0m";
 
    public static void main(String[] args) {
        drawZone();
    }
 
    static void drawZone() {
        clearScreen();
 
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
 
                boolean wallHorizontal = (y == 0 || y == HEIGHT - 1);
                boolean wallVertical   = (x == 0 || x == 1 || x == WIDTH - 2 || x == WIDTH - 1);
 
                if (wallHorizontal || wallVertical) {
                    // Mur d’enceinte
                    System.out.print(BG_WALL + " ");
                } else {
                    // Damier : 2 colonnes / 1 ligne
                    boolean light = ((x / 2) + y) % 2 == 0;
                    String bg = light ? BG_LIGHT : BG_DARK;
                    System.out.print(bg + " ");
                }
            }
            System.out.println(RESET);
        }
    }
 
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}