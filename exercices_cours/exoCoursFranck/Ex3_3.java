//rechercher un nombre entier dans un tableau (trié par ordre croissant)
package exoCoursFranck;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex3_3 
{
    public static void main(String[] args) 
    {
        
        int     nbcases; //Nombre de celulles dans le tableau
        int     nbU; //Nombre choisi par l'utilisateur
        int     position    = 0;
        boolean trouve  = false;

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        System.out.print("Définissez la taille du tableau : ");
        nbcases = sc.nextInt();
        int monTab[] = new int[nbcases]; //creation d'un tableau, une dimension, N cellules
                
        for (int i = 0 ; i < monTab.length; i++)
        {
            monTab[i] = rng.nextInt(0,101);
        }

        Arrays.sort(monTab);
        System.out.print("[");
        for (int elements : monTab)
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
                position = i;
                break;
            }
        }

        if (!trouve)
        {
            System.out.println("Le nombre saisie n'est pas dans le tableau");
        }
        else System.out.println("Le nombre se trouve dans le tableau à la position : "+(position+1));

        sc.close(); 



    }
}
