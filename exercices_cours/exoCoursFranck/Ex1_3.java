package exocoursfranck;
import java.util.Scanner;
public class Ex1_3
{
    public static void main(String[] args)
    {
        //definition des variables
        double r,a;
        double result;
        Scanner sc = new Scanner(System.in);

        //Entrer les valeurs
        System.out.print("Entrez la valeur du rayon : ");
        r = sc.nextDouble();
        System.out.print("Entrez la valeur de l'angle en degré(s) : ");
        a = sc.nextDouble();

        //calcul
        result = (Math.PI * Math.pow(r,2)*a) / 360;

        //affichage du résultat
        System.out.printf("L'aire du secteur circulaire = %.2f",result);

        sc.close();

    }
}