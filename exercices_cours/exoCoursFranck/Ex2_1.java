package exoCoursFranck;
import java.util.Scanner;
public class Ex2_1 
{
    public static void main(String[] args)
    {
        //Definir les variables
        int age;
        Scanner sc = new Scanner(System.in);

        //interface
        System.out.print("Bonjour,\nEntrez votre âge : ");
        age = sc.nextInt();

        //Definir majorité ou non
        if (age >= 18)
            System.out.println("Vous avez "+age+" ans, vous êtes donc majeur.");
        else if (age < 18 && age >= 0)
            System.out.println("Vous avez "+age+" an(s), vous êtes donc mineur.");
        else
            System.out.println("Vous n'êtes pas encore né...");

        sc.close();
    }    
}
