package exoCoursFranck;

import java.util.Scanner;

public class Ex1_4 
{
    public static void main(String[] args)
    {
        //Definition des variables
        double S,i,is,ic;
        int N;
        Scanner sc = new Scanner(System.in);
        
        //Entrées des valeurs
        System.out.println("Quel est le solde de votre compte ? ");
        S = sc.nextDouble();
        System.out.println("Quel est le taux d'intéret en % ? ");
        i = sc.nextDouble();
        System.out.println("Entrez le nombre d'année d'intérets à calculer : ");
        N = sc.nextInt();

        //calculs
        is = S*(1+N*i/100);
        ic = S*Math.pow((1+i/100), N);

        //Affichage du résultat
        System.out.printf("Intérêt simple : %.2f%n",is);
        System.out.printf("Intérêts composé : %.2f",ic);
        
        sc.close();

    }    
}
