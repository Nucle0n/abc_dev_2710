package exoTierceQuinte;

// EXERCICE 4

import java.util.Scanner;

// Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce
// nombre. Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15
// NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

public class E04 {
    public static void main(String[] args) {
        int nbUser;
        int temp = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre : " );
        nbUser = sc.nextInt();

        for (int i = 0; i < nbUser; i++) {
            count++;
            temp += count;
            System.out.print(count+" "); //Debug (affichage pour voir chaque nombre intermédiaires)
        }

        System.out.printf( "%ntotal = %d%n",temp);

        sc.close();

    }
}
