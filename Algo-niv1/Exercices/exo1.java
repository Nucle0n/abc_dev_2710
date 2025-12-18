/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args){
    
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
    System.out.println("Resultat vaut " + resultat);

    sc.close();

    }
}