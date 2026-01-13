import java.util.Scanner;

public class part2JbAlgo3 
{
    public static void main(String[] args)
    {
        //Déclaration des variables :
        int i=10;
        Boolean cpt = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Voulez-vous lancer le compte à rebours ?");
        cpt = sc.nextBoolean();

        if (cpt == true)
        {
            while (i>0)
            {
                System.out.println(i);
                i--;
            }
            System.out.println("Bonne année 2026 !!!");

        }
        else System.out.println("Compte à rebours annulé");

        sc.close();
    }
    
}
