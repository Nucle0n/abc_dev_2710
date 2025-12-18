/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/
import java.util.Scanner; 

public class exo4 { 
    public static void main(String[] args) { 
        // Définition des variables 
        Scanner sc = new Scanner(System.in);
        int a;

        // Entrée de la valeur pour a
        System.out.print("a = ");
        a= sc.nextInt();

        // Vérification si a est divisible par 2
        if (a % 2 == 0)
        {
            System.out.println("a est bien divisible par 2");    
        }
        else
        {
            System.out.println("a n'est pas divisible par 2");
        }

        sc.close();

    }
}
