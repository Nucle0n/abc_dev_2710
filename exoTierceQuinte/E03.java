package exoTierceQuinte;

import java.util.Scanner;

// EXERCICE 3
// Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.
// Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.
// Ecrire cet algorithme dans un premier temps avec une boucle tant que, pus avec une boucle pour.

public class E03 {
    public static void main(String[] args) {
        int nbUser;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        nbUser = sc.nextInt();

        for (int i = nbUser + 1; i <= nbUser +10 ; i++) {
            System.out.println(i);
            
        }

        sc.close();
    }
}