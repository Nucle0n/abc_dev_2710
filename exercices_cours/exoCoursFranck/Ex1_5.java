package exocoursfranck;
import java.util.Scanner;

public class Ex1_5
{
    public static void main(String[] args)
    {
        //Definition des variables
        int a,b,temp;
        Scanner sc = new Scanner(System.in);

        //Entrées des valeurs
        System.out.print("Entrez une valeur pour A : ");
        a = sc.nextInt();
        
        System.out.print("Entrez une valeurpour B : ");
        b = sc.nextInt();
        
        System.out.println("Actuellement A = "+a+" et B = "+b);
        System.out.println("\nOn met le contenu de A dans B et inverssement");
        temp = a;
        a = b;
        b = temp;
        System.out.println("Désormais A = "+a+" et B = "+b);

        sc.close();
    }
}
