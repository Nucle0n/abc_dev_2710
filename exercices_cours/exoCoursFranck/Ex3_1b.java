package exocoursfranck;

import java.util.Random;
import java.util.Scanner;

public class Ex3_1b 
{
    public static void main(String[] args) 
    {
        int     No,
                Nu,
                min = 0,
                max = 100, 
                essai = 0;
        Scanner sc = new Scanner(System.in);
        Random  rd = new Random();

        //Random number picker
        No = rd.nextInt(0, 101);

        //Loop UI
        do 
        {
            System.out.printf("Entrez une proposition entre %d et %d :", min, max);
            Nu = sc.nextInt();
            essai++;
            if (Nu > min && Nu < max) 
            {
                if (Nu > No) max = Nu;
                else if (Nu < No) min = Nu;
            } 
            else System.out.println("Vous êtes en dehors de l'intervalle");
            
            //try counter
            System.out.println("Essai : " + essai + "\n");
        } 
        while (Nu != No && Nu > 0);
        System.out.println("Bravo vous avez trouvez le nombre mystère qui est " + No + " en " + essai + " essai(s).");

        sc.close();

    }
}
