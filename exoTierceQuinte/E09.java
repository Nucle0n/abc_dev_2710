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
        
        int chevaux; // nombre de chevaux partants (n)
        int njChevaux; // nombre de chevaux joués (p)

        String choix = "";
        String choixOrdre = " ";

        boolean ordreTF = false;
        
        long ordre; // chances de gagner dans l'ordre (x)
        long desordre; // chances de gagner dans le désordre (y)

        long factChevaux = 1;
        long factNJChevaux = 1;
        long factDiff = 1;
        
        System.out.print("Entrez le nombre de chevaux partants : ");
        chevaux = sc.nextInt();
        
        // System.out.print("Entrez le nombre de chevaux joués : ");
        System.out.printf("%nChoisissez :%n\033[1;4m\t\t3\033[0m - Tiercé%n\033[1;4m\t\t4\033[0m - Quarté%n\033[1;4m\t\t5\033[0m - Quinté%n%n");
        njChevaux = sc.nextInt();
        
        switch (njChevaux) {
            case 3:
                choix = "tiercé";
                break;
            case 4:
                    choix = "quarté";
                break;
            case 5:
                    choix = "quinté";
                break;
            default:
            System.out.println("Saisir 3, 4 ou 5");
        }

        System.out.printf("%nVoulez vous le\033[33m %s\033[0m dans l'ordre ? ",choix);
        sc.nextLine();

        while (!choixOrdre.equalsIgnoreCase("o") || !choixOrdre.equalsIgnoreCase("n") || !choixOrdre.equalsIgnoreCase("oui") || !choixOrdre.equalsIgnoreCase("non")){
            System.out.printf("Répondez par \033[1;4mO\033[0mui ou \033[1;4mN\033[0mon (O/N) : ",choix);
            
            choixOrdre = sc.nextLine().trim().toLowerCase();

            if (choixOrdre.equalsIgnoreCase("o") || choixOrdre.equalsIgnoreCase("oui")) {
                ordreTF = true;
                break;
            }
            if (choixOrdre.equalsIgnoreCase("n") || choixOrdre.equalsIgnoreCase("non")) {
                ordreTF = false;
                break;
            }
        }

        for (int i = 1; i <= chevaux; i++) {
            factChevaux = factChevaux * i;
            if (i <= njChevaux) {
                factNJChevaux = factNJChevaux * i;
            }
            if (i <= chevaux - njChevaux) {
                factDiff = factDiff * i;
            }
        }

        ordre = factChevaux / factDiff;
        desordre = factChevaux / (factNJChevaux * factDiff);

        if (ordreTF) {
            System.out.printf("%nPour le\033[33m %s\033[0m dans l'ordre :%nVous avez\033[33m 1/%d\033[0m chance de gagner.%n%n",choix, ordre);
            
        } else {
            System.out.printf("%nPour le\033[33m %s\033[0m dans le désordre :%nVous avez\033[33m 1/%d\033[0m chance de gagner.%n%n",choix, desordre);
        }
        
        sc.close();

    }
}
