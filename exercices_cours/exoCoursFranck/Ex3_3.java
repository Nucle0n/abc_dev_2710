//rechercher un nombre entier dans un tableau (trié par ordre croissant)
package exocoursfranck;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ex3_3 
{
    public static void main(String[] args) 
    {
        
        int     nbcell; //Nombre de celulles dans le tableau
        int     nbU; //Nombre choisi par l'utilisateur
        int     numOcc      = 0; //
        boolean trouve      = false;
        String chainVal     = "";

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();


        System.out.print("Définissez la taille du tableau : ");
        nbcell = sc.nextInt();
        Integer[] monTab = new Integer[nbcell]; //creation d'un tableau, une dimension, N cellules (integer pour pouvoir utiliser la méthode reverseOrder de la class Comparator)
        int[] occurence = new int[nbcell];

        for (int i = 0 ; i < monTab.length; i++)
        {
            monTab[i] = rng.nextInt(101);
        }

        Arrays.sort(monTab, Comparator.reverseOrder()); //classe les valeurs contenues dans le tableau dans l'ordre croissant (classe Comparator, méthode reverseOrder, pour classer en décroissant)
        System.out.print("[");
        for (long elements : monTab)
        {
            System.out.print(elements + " ");
        }
        System.out.println("]");

        System.out.print("veuillez saisir un nombre entre 0 et 100 : ");
        nbU = sc.nextInt();

        for (int i = 0; i < monTab.length; i++)
        {
            if (monTab[i]==nbU)
            {
                trouve=true;
                occurence[numOcc] = i+1; // l'indice + 1, poru la position
                numOcc++;
            }
        }

        if (!trouve)
        {
            System.out.println("Le nombre saisie n'est pas dans le tableau");
        }
        else 
            
            for (int position : occurence)
            {
                if (position != 0) chainVal += position+", ";   
            }
            String souString = chainVal.substring(0, chainVal.length()-2);
            System.out.println("Le nombre se trouve dans le tableau au(x) position(s): "+souString);

        sc.close();

    }
}
