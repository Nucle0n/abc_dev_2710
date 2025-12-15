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
        is = S*(1+N*i);
        ic = S*Math.pow((1+i), N);

        //Affichage du résultat
        System.out.printf("Avec un solde de départ de %.2f , un taux d'intéret de %.2f % après %d années : ",S,i,N) ;
        System.out.println("Intérêt simple : " +is);
        System.out.println("Intérêts composé : "+ic);

        sc.close();
    }    
}
