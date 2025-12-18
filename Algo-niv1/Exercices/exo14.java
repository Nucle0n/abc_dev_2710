/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
*/
import java.util.Scanner;
public class exo14  
{
    public static void main(String[] arg)
    {
        // Définition des variables
        Scanner sc = new Scanner(System.in);
        boolean A, B, C, S;
    
        // Saisie des valeurs A, B et C
        System.out.print("Donner une valeur A (TRUE/FALSE) : ");
        A = sc.nextBoolean();
        System.out.print("Donner une valeur B (TRUE/FALSE) : ");
        B = sc.nextBoolean();
        System.out.print("Donner une valeur C (TRUE/FALSE) : ");
        C = sc.nextBoolean();

        // Calcul de l'expression A OU B ET NON C
        S = A || B && !C;

        // Affichage du résultat
        System.out.println("Résultat : " + S);

        sc.close();
    }

}
