import java.util.Scanner;
public class jalonblanc_ex2 
{
    public static void main(String[] args)
    {
        //Definition de svariables 
        Scanner sc = new Scanner(System.in);
        int i    = 0,
            init = 100;
        while (init > 0)
        {
            System.out.println("Vous avez "+init+"cl dans votre bouteille, combien de centilitres voulez vous boire ? :");
            i = sc.nextInt();
            init -= i;
            if (init > 0)
            System.out.println("Vous avez bu "+i+"cl. Il reste encore "+init+"cl dans votre bouteille.");
                else if(i > init)
                    System.out.println("Vous avez bu "+(init+i)+"cl. Votre bouteille est vide.");
            else
                System.out.println("Vous avez bu "+i+"cl. Votre bouteille est vide.");
        }

    }
    
}
