package exoCoursFranck;

import java.util.Scanner;

public class Ex2_6 
{
    public static void main(String[] args) 
    {
        //variables
        int N,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez une valeur pour N : ");
        N = sc.nextInt();
        
        for ( i = 2; i < N && N%i != 0; i++);
        if (i == N) System.out.println(N+" est un nombre premier.");
        else System.out.println(N+" n'est pas un nombre premier.");

        sc.close();
    }    
}
