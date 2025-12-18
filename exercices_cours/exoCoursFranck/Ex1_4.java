package exoCoursFranck;

import java.util.Scanner;

public class Ex1_4 
{
    public static void main(String[] args)
    {
        //Definition des variables
        double S,i,is,ic,tauxa;
        int N;
        Scanner sc = new Scanner(System.in);
        
        
        //Entrées des valeurs
        System.out.println("Quel est la somme que vous voulez placer ? ");
        S = sc.nextDouble();
        System.out.println("Quel est le taux d'intéret en % ? ");
        i = sc.nextDouble();
        System.out.println("Entrez le nombre d'année d'intérets à calculer : ");
        N = sc.nextInt();
        tauxa=i/100;
        //calculs
    
    
        is = S*(1+N*tauxa);
        ic = S*Math.pow((1+tauxa), N);

        //Affichage du résultat
        System.out.printf("Intérêt simple : %.2f%n",is);
        System.out.printf("Intérêts composé : %.2f%n",ic);
        
        sc.close();

    }    
}
