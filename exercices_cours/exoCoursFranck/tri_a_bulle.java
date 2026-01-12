package exocoursfranck;

// Exercice 3.4 : Tri d'un tableau
// Nous désignerons par a1, a2, ..., aN les éléments d'un tableau à trier par ordre croissant en utilisant la méthode du tri à bulle.
// Le principe du tri à bulles (bubble sort ou sinking sort) est de comparer deux à deux les éléments a1 et a2 consécutifs 
// d'un tableau et d'effecteur une permutation si a1 > a2. On continue de trier jusqu'à ce qu'il n'y ait plus de permutation.

import java.util.Random;
import java.util.Scanner;

public class tri_a_bulle
{
    public static void main(String[] args)
    {
        int     n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantité de nombres dans le tableau : ");
        n = sc.nextInt();

        int[] monTab = new int[n];
        tri_a_bulle.remplirTableau(monTab);
        System.out.print("Tableau non trié :");
        tri_a_bulle.afficherTableau(monTab);
        tri_a_bulle.triABulle(monTab);
        System.out.print("\nTableau trié :");
        Exp2_3_4.afficherTableau(monTab);

        sc.close();
    }

    // Fonction pour remplir le tableau :
    public static void remplirTableau(int[] _tableau)
    {
        Random rng = new Random();
        for (int i=0; i<_tableau.length; i++){
            _tableau[i]=rng.nextInt(101);
        }
    }

    // Fonction de Tri à bulle :
    public static void triABulle (int[] _tableau)
    {
        int     enCours,
                temp,
                passage = 0;
        boolean permut = true;
        while (permut)
        {
            permut = false;
            passage ++;
            for (enCours = 0; enCours < 20 - passage; enCours++)
            {
                if (_tableau[enCours] > _tableau[enCours+1])
                {
                    permut = true;
                    temp = _tableau[enCours];
                    _tableau[enCours] = _tableau[enCours+1];
                    _tableau[enCours+1] = temp;
                }
            }
        }
    }

    // Fonction s'affichage du tableau :
    public static void afficherTableau (int[] _tableau)
    {
        System.out.print("\n");
            for (int element : _tableau){
                System.out.print(element+" ");
            }
        System.out.print("\n");
    }
}
