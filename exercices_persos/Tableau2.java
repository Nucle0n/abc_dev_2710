// demande à l’utilisateur de saisir des valeurs
// stocke chaque valeur dans une case d’un tableau
// parcourt le tableau
// additionne les valeurs contenues dans chaque case
// affiche le résultat final

import java.util.Scanner;

// public class Tableau2 
// {
//     public static void main(String[] args) 
//     {
//         int val1, val2;
//         int summ;
        
//         int[] tab1 = new int[2];
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Entrez une première valeur : ");
//         val1 = sc.nextInt();
//         System.out.print("Entrez une seconde valeur : ");
//         val2 = sc.nextInt();

//         tab1[0] = val1;
//         tab1[1] = val2;
//         summ = tab1[0]+tab1[1];

//         System.out.println("Le résultat final est : "+summ);

//         sc.close();
//     }
// }

public class Tableau2 {
    public static void main(String[] args) {

        int somme = 0;
        int[] tab = new int[2];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        System.out.println("Le résultat final est : " + somme);
        sc.close();
    }
}