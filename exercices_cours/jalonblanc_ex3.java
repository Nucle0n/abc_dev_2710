/* Compte à rebours, commence à 10, fini avec "Bonne année 2026 !!!" */

import java.util.Scanner;
public class jalonblanc_ex3 
{
    public static void main(String[] args)
    {
    //variables :
    Scanner sc = new Scanner(System.in);
    int i = 10;
    boolean cpt;

    System.out.print("Voulez vous lancer le compte à rebours ? (true / false) :");
    cpt = sc.nextBoolean();
    if (cpt)
    {
        System.out.println(i);
        while (i>1)
        {
            i--;
            System.out.println(i);
        }
        System.out.println("Bonne année 2026 !!!");
    }
    sc.close();

    }
    
}
