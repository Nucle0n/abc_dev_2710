package exocoursfranck;

import java.util.Scanner;

public class Ex1_2 
{
   public static void main(String[] args)
   {
        //Définir les variables
        double r, air, volume;
        Scanner sc = new Scanner(System.in);
        
        //Entrer le rayon
        System.out.print("Entrez la valeur du rayon : ");
        r = sc.nextDouble();

        //Calculs 
        //Air du cercle : 
        air =  4*(Math.PI * Math.pow(r,2));
        //Volume de la sphère :
        volume = (4.0/3.0)*Math.PI*Math.pow(r,3);

        //Affichage du résultat :
        System.out.printf("L'air de la sphère est : %.2e\nLe volume de la sphère est : %.2e",air,volume);

        sc.close();

   } 
}
