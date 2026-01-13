import java.util.Scanner;

public class part2JbAlgo2 
{
    public static void main(String[] args) 
    {
        //Déclaration des variables :
        int     bouteille   = 100,
                bu          = 0;
        Scanner sc          = new Scanner(System.in);
        
        //Mise en place d'une boucle, tant qu'il ya  du liquide dans la bouteille
        while (bouteille > 0) 
        {
            System.out.printf("Vous avez %dcl dans votre bouteille, combien de centilitre(s) voulez vous boire ?%n",bouteille);
            bu = sc.nextInt();
            if (bu < bouteille) //On ne peut pas boire plus que ce qu'il y a dans la bouteille
            {
                System.out.printf("Vous avez bu %dcl dans votre bouteille. Il reste encore %dcl dans votre bouteille.%n",bu,bouteille-bu);
                bouteille -= bu;
            }
            else break; //Si plus assez de liquide dans la bouteille
        }

        System.out.printf("Vous avez bu %dcl dans votre bouteille, votre bouteille est vide.%n",bouteille);
        
        sc.close();
    }
    
}
