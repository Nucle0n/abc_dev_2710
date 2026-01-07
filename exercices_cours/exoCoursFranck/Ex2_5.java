package exocoursfranck;

import java.util.Scanner;

public class Ex2_5 
{
    public static void main(String[] args)
    {
        //var
        int N,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        N = sc.nextInt();

        for (i = 2; i < N ; i++)
            if (N % i == 0)
            System.out.print(" "+i);
        sc.close();
    }
    
}
