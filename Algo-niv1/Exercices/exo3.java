/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args)
    {    
    // Définition des variables
    Scanner sc = new Scanner(System.in);
    int a, b, resultat;

    // Entrée des valeurs pour a et pour b
    System.out.print("a = ");
    a  = sc.nextInt();
    System.out.print("b = ");
    b = sc.nextInt();

    // Calcul et affichage du résultat
    resultat = a + b;
    System.out.println("Resultat = a + b");
    System.out.println("Resultat = " + resultat);

    // Vérification si le résultat est paire ou impaire
    if(resultat % 2 == 0)
    {
        System.out.println("Resultat est paire");
    }

    else
    {
        System.out.println("Resultat est impaire");
    }

    sc.close();

    }
}

