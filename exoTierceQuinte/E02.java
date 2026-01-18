package exoTierceQuinte;

import java.util.Scanner;

// EXERCICE 2
// Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.
// En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus
// grand ! » si le nombre est inférieur à 10.

public class E02 {

    public static void main(String[] args) {
        
        int nbUser;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entre 10 et 20 : ");
       
        do {
            // sc.next();
            nbUser = sc.nextInt();

            if (nbUser > 20){
                System.out.print("Plus petit ! : ");
            }
            if (nbUser < 10){
                System.out.print("Plus grand ! : ");
            }
        }
        while (nbUser < 10 || nbUser > 20);

        System.out.printf("Le nombre entré est : %d",nbUser);


        sc.close();
    }
    
}
