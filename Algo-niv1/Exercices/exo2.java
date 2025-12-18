/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */
import java.util.Scanner;

public class exo2 {
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
    resultat = a - b;
    System.out.println("Resultat = a - b");
    System.out.println("Resultat = " + resultat);

    // Vérification si le résultat est inférieur à 0
    if(resultat < 0){
        System.out.println("Resultat est inférieur à 0");
    }

    sc.close();

    }
}