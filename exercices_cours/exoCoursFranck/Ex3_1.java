package exocoursfranck;

import java.util.Random;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        int No,
                Nu,
                min = 0,
                max = 100, essai = 0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        No = rd.nextInt(0, 101);

        do {

            System.out.printf("Entrez une proposition entre %d et %d :", min, max);
            Nu = sc.nextInt();
            
            if (Nu > min && Nu < max)
            {
                if (Nu > No)
                {
                    max = Nu;
                    essai++;
                System.out.println("c'est votre essai numero "+ essai+"\n");
                } else if (Nu < No)
                {
                    min = Nu;
                    essai++;
                    System.out.println("c'est votre essai numero "+ essai+"\n");
                } else
                {  essai++;
                System.out.println("c'est votre essai numero "+ essai+"\n");}
            }
            else
            {
                System.out.println("Vous êtes en dehors de l'intervalle");
                essai++;
                System.out.println("c'est votre essai numero "+ essai+"\n");
            }
            

            

        } while (Nu != No && Nu > 0);
            System.out.println("Bravo vous avez trouvez le nombre mystère qui est "+No+" en "+essai+" essai(s).");

        sc.close();

    }
}
