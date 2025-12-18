package exoCoursFranck;

import java.util.Scanner;

public class Ex2_2 
{
    public static void main(String[] args)
    {
        //Definir les variables
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une valeur pour \"a\" : ");
        a = sc.nextInt();
        System.out.print("Entrer une valeur pour \"b\" : ");
        b = sc.nextInt();

        if (a < b)
            System.out.println(a+", "+b);
        else if (a > b)
            System.out.println(b+", "+a);
        else
            System.out.println(a+" = "+b);


        sc.close();
    }
    
}
