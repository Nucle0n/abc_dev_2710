package exocoursfranck;
// Exercice 3.4 : Tri d'un tableau
// Nous désignerons par a1, a2, ..., aN les éléments d'un tableau à trier par ordre croissant.
// On commence par chercher l'indice du plus petit des éléments, soit j cet indice.
// On permute alors les valeurs de a1 et aj .
// On cherche ensuite l'indice du plus petit des éléments a2, a3, ..., an et on permute avec a2, etc.


import java.util.Random;
import java.util.Scanner;

// //Ma partie :
// public class Exp2_3_4 {
//     public static void main(String[] args) {
//         Random rng = new Random();
//         int nbCells = rng.nextInt(4,21);
//         int[] tab = new int[nbCells];
//         for (int i = 0; i < tab.length; i++) { // boucle for afin pour passer sur chaque case du tableau, j'aurais pu utiliser nbCells à la place de "tab.length"
//             tab[i] = rng.nextInt(0, 101); // On attribue une valeur random (entre 0 et 100) à la case du tableau d'indice "i"
//         }

//         System.out.print("\033[34;3mEtat d'origine du tableau : \033[0m"); // Affichage contenu du tableau avant triage
//         System.out.println("\033[33;1m" + Arrays.toString(tab) + "\033[0m");

//     }
// }

// Corrigé Franck :

public class Exp2_3_4{
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de nombres voulez vous saisir : ");
        n = sc.nextInt();

        int[] monTab = new int[n];
        Exp2_3_4.remplirTableau(monTab);
        System.out.print("Voici le tableau :");
        Exp2_3_4.afficherTableau(monTab);
        Exp2_3_4.trierTableau(monTab);
        System.out.print("\nVoici le tableau trié :");
        Exp2_3_4.afficherTableau(monTab);

        sc.close();
    }

    //Fonction de trie
    public static void  trierTableau(int[] _tableau)
    {
        int enCours,
            plusPetit,
            temp,
            j;
        for (enCours = 0; enCours < _tableau.length - 1; enCours++) {
            plusPetit = enCours;
            for (j = enCours + 1; j < _tableau.length; j++) {
                if (_tableau[j] < _tableau[plusPetit]) {
                    plusPetit = j;
                }
            }
            // Permutation des éléments
            temp = _tableau[enCours];
            _tableau[enCours] = _tableau[plusPetit];
            _tableau[plusPetit] = temp;
        }
    }

    //Fonction/méthode pour remplir le tableau
    public static void remplirTableau(int[] _tableau)
    {
        Random alea = new Random();
        for (int i=0; i<_tableau.length; i++){
            _tableau[i]=alea.nextInt(101);
        }
    }
    
    //fonction/méthode pour afficher le tableau
    public static void afficherTableau (int[] _tableau)
    {
        System.out.print("\n");
            for (int element : _tableau){
                System.out.print(element+" ");
            }
    }
}


// Corrigé par IA :

// public class Exp2_3_4 {
//     public static void main(String[] args) {
//         int[] tab = {34, 12, 5, 67, 23, 1, 89, 45};

//         System.out.println("Tableau avant le tri :");
//         for (int value : tab) {
//             System.out.print(value + " ");
//         }
//         System.out.println();

//         // Tri par sélection
//         for (int i = 0; i < tab.length - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < tab.length; j++) {
//                 if (tab[j] < tab[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             // Permutation des éléments
//             int temp = tab[i];
//             tab[i] = tab[minIndex];
//             tab[minIndex] = temp;
//         }

//         System.out.println("Tableau après le tri :");
//         for (int value : tab) {
//             System.out.print(value + " ");
//         }
//         System.out.println();
//     }
// }
