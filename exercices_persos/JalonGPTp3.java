// Problème n°3 – Validation par condition

import java.util.Scanner;

public class JalonGPTp3 
{
    public static void main(String[] args) 
    {
        //Déclaration des variables
        int i;
        boolean car;
        Scanner sc = new Scanner(System.in);

        System.out.print("Souhaitez-vous afficher les nombres pairs de 1 à 20 ? (true/false) : ");
        while (!sc.hasNextBoolean())
        {
            System.out.print("Erreur de saisie, entrez \"true\" ou \"false\" : ");
            sc.next();
        }       
        car = sc.nextBoolean();

        if (car == true)
        {    
            for (i=1; i<=20; i++)
            {
                if (i%2 == 0) System.out.println(i);
            }
        }
        
        else System.out.println("Affichage annulé");


    }
    
}
