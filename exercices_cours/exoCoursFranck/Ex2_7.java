package exocoursfranck;

import java.util.Scanner;

public class Ex2_7 
{
    public static void main(String[] args) 
    {
        //Variables
        double  mtk = 1.609,
                k,
                ktm;
        Scanner sc = new Scanner(System.in);

        //Interface
        System.out.println("\n*********[CONVERTISSEUR KM -> MILES]*********");
        while (true) 
        {
            System.out.print("\nEntrez une valeur en km : ");
            k = sc.nextDouble();
            if (!(k >= 0.01 && k<= 1000000)) 
                System.out.println("Erreur : la valeur entrée n'est pas valide.");
            else break;
        }
        //Calcul
        ktm = k / mtk;
        

        //resultat
        System.out.printf("%.2f km = %.2f Miles%n%n",k,ktm);


        sc.close();

    }
    
}
