package exoTierceQuinte;

import java.util.Scanner;

// Exercice 1 :
// Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse
// convienne.


public class E01 {
    public static void main(String[] args) {
        
        int nbUser;
        Scanner sc = new Scanner(System.in);

        do {
        System.out.print("Entrez un nombre entre 1 et 3 : ");
        nbUser = sc.nextInt();
        }
        while (nbUser < 1 || nbUser > 3);

        System.out.printf("Le nombre choisi est : %d",nbUser);

        sc.close();

    }
}
