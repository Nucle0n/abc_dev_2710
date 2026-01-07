package exocoursfranck;
import java.util.Scanner;

public class ex1_1 
{
    public static void main(String[] args)
    {
        //Definition des variables
        Scanner sc = new Scanner(System.in);
        int a,b;
        double result;

        //Definition des valeurs
        System.out.print("Veuilez saisir un premier nombre entier : ");
        a = sc.nextInt();
        System.out.print("Veuilez saisir un second nombre entier : ");
        b = sc.nextInt();

        //Calcul
        result = (a + b) /(double) 2;

        //Affichage du résultat
        System.out.printf("la moyenne de %d et  %d est : %.2f",a,b,result);
        sc.close();
    }
}