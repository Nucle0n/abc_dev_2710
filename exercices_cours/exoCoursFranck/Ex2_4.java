package exocoursfranck;

import java.util.Scanner;

public class Ex2_4
{
    public static void main(String[] args)
    {
        //variables:
        int A;
        Scanner sc = new Scanner(System.in);

    System.out.print("Entrez une année : ");
    A = sc.nextInt();

    if (A % 4 == 0)
    {
        if ((A % 100 == 0) && !(A % 400 == 0))
            System.out.println(A+" n'est pas une année bissextile");
        else
            System.out.println(A+" est une année bissextile"); 
    }
    else 
        System.out.println(A+" n'est pas une année bissextile");

    sc.close();
    }
}
