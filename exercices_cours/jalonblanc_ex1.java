import java.util.Scanner;
public class jalonblanc_ex1 
{
    public static void main(String[] args) 
    {
        //definition de svariables
        Scanner sc = new Scanner(System.in);
        double  a,
                b;
        
        System.out.print("Entrez une valeur pour \"a\" : ");
        a = sc.nextDouble();
        System.out.print("Entrez une valeur pour \"b\" : ");
        b = sc.nextDouble();
    
        //Condition de comparaison
        if (a==b) System.out.println("Après comparaison : a et b son égaux.");
        else if (a>b) System.out.println("Après comparaison a est supérieur à b.");
        else System.out.println("Après comparaison b est supérieur à a");

        sc.close();

    }
}
