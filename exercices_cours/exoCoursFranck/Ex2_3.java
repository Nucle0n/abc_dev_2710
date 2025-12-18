package exoCoursFranck;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_3 
{
    public static void main(String[] args)
    {
        //Definition des variables
        int[] list = {0,0,0};
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de \"a\" : ");
        list[0] = sc.nextInt();
        System.out.print("Entrez la valeur de \"b\" : ");
        list[1] = sc.nextInt();
        System.out.print("Entrez la valeur de \"c\" : ");
        list[2] = sc.nextInt();

        Arrays.sort(list);
        for (int position = 0 ; position < list.length ; position++) 
        System.out.println(list[position]);

        sc.close();
    }
}
