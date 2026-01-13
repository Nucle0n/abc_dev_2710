import java.util.Scanner;

public class JalonGPTp1 
{
    public static void main(String[] args) 
    {
        //Déclarationd es variables : 
        double  a,b; //le type n'étant pas précisé dans l'énoncé, je vhoisi un double pour couvrir tous les cas.
        Scanner sc = new Scanner(System.in);

        //Entrez des valeurs pour a et b pour l'utilisateur :
        System.out.print("Entrez une valeur pour a : ");
        a = sc.nextDouble();
        System.out.print("Entrez une valeur pour b : ");
        b = sc.nextDouble();

        //programme :
        if      (a<b)   System.out.println("a est inférieur à b");
        else if (a>b)   System.out.println("a est supérieur à b");
        else            System.out.println("a et b sont égaux");
    
        sc.close();
    }    
}
