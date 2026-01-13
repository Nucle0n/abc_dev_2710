//Problème n°2

import java.util.Scanner;

public class JalonGPTp2 
{
    public static void main(String[] args) 
    {
        //Déclaration des variables
        int i=-1;
        Scanner sc = new Scanner(System.in);

        while (i<=0)
        {
            System.out.print("Entrez un nombre nombre positif : ");
            while (!sc.hasNextInt())
            {
                System.out.println("Erreur de saisie, veuillez entrer un nombre : ");
                sc.next();
            }
            i = sc.nextInt();
        }
        while (i>=0)
        {
            System.out.println(i);
            i--;
        }

        System.out.println("Fin du compte à rebours");

        sc.close();
    }    
}
