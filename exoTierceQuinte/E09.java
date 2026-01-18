package exoTierceQuinte;

import java.util.Scanner;

// EXERCICE 9
// Écrire un algorithme qui permette de connaître ses chances de gagner au tiercé, quarté, quinté et autres
// impôts volontaires.
// On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux
// messages affichés devront être :
// Dans l’ordre : une chance sur X de gagner
// Dans le désordre : une chance sur Y de gagner
// X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de
// chevaux joués, le signe ! signifie « factorielle » :
// X = n ! / (n - p) !
// Y = n ! / (p ! * (n – p) !)
// NB : cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses
// performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par
// écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version
// permettant de le résoudre.


public class E09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n; // nombre de chevaux partants
        int p; // nombre de chevaux joués
        long x; // chances de gagner dans l'ordre
        
        long y; // chances de gagner dans le désordre
        long factN = 1;
        long factP = 1;
        long factNMinusP = 1;
        
        System.out.print("Entrez le nombre de chevaux partants : ");
        n = sc.nextInt();
        
        System.out.print("Entrez le nombre de chevaux joués : ");
        p = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            factN *= i;
            if (i <= p) {
                factP *= i;
            }
            if (i <= n - p) {
                factNMinusP *= i;
            }
        }

        x = factN / factNMinusP;
        y = factN / (factP * factNMinusP);

        System.out.printf("Dans l'ordre : une chance sur %d de gagner%n", x);
        System.out.printf("Dans le désordre : une chance sur %d de gagner%n", y);
        
        sc.close();

    }
    
}
