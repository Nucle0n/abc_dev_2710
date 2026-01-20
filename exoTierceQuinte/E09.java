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
        
        int chevaux         = 1;        // nombre de chevaux partants (n)
        int njChevaux       = 0;        // nombre de chevaux joués (p)

        String choix        = "";
        String choixOrdre;

        boolean ordreTF     = false;
        
        long ordre;                     // chances de gagner dans l'ordre (x)
        long desordre;                  // chances de gagner dans le désordre (y)
        
        System.out.println("\nCombien de chevaux sur la ligne de départ ?");
        do  {
            System.out.print("Choisisez un nombre entre 12 et 20 : ");
            chevaux = sc.nextInt();
        }
        while (chevaux < 10 || chevaux > 20);
        
        System.out.printf("%nChoisissez :%n\033[1;4m\t\t3\033[0m - Tiercé%n\033[1;4m\t\t4\033[0m - Quarté%n\033[1;4m\t\t5\033[0m - Quinté%n%n");
        do {
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
                System.out.print("Saisir 3, 4 ou 5 : ");
            }
        } while (njChevaux != 3 && njChevaux != 4 && njChevaux != 5);

        System.out.printf("%nVoulez vous le\033[33m %s\033[0m dans l'ordre ? ",choix);
        sc.nextLine();

        while (true){
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
        // n -> chevaux
        // p -> njChevaux
        // X -> ordre = n ! / (n - p) !
        // Y -> desordre = n ! / (p ! * (n – p) !)

        // ordre = factorielle(chevaux) / factorielle(chevaux - njChevaux);
        ordre = factorielleRecursive(chevaux) / factorielleRecursive(chevaux - njChevaux);

        //desordre = factorielle(chevaux) / (factorielle(njChevaux) * factorielle(chevaux - njChevaux));
        desordre = factorielleRecursive(chevaux) / (factorielleRecursive(njChevaux) * factorielleRecursive(chevaux - njChevaux));

        

        // long factChevaux    = 1;
        // long factNJChevaux  = 1;
        // long factDiff       = 1;

        // for (int i = 1; i <= chevaux; i++) {
        //     factChevaux = factChevaux * i;
        //     if (i <= njChevaux) {
        //         factNJChevaux = factNJChevaux * i;
        //     }
        //     if (i <= chevaux - njChevaux) {
        //         factDiff = factDiff * i;
        //     }
        // }

        // ordre = factChevaux / factDiff;
        // desordre = factChevaux / (factNJChevaux * factDiff);

        if (ordreTF) {
            System.out.printf("%nPour le\033[33m %s\033[0m dans l'ordre :%nVous avez\033[33m 1/%d\033[0m chance de gagner.%n%n",choix, ordre);
            
        } else {
            System.out.printf("%nPour le\033[33m %s\033[0m dans le désordre :%nVous avez\033[33m 1/%d\033[0m chance de gagner.%n%n",choix, desordre);
        }
        
        sc.close();

    }

    // Fonction : factorielle
    public static long factorielle (long _nb){
        long temp = _nb;
        
        for (int i = 1; i < temp; i++) {
            _nb = _nb*i;
        }
        return _nb;
        
    }

    // Fonction : Factorielle récursive
    public static long factorielleRecursive (long _nb){
        if (_nb > 1){
            return (_nb * factorielleRecursive(_nb-1));
        }
        else{
            return 1;
        }
    }

}
