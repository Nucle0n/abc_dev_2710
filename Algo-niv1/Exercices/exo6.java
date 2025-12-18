/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo6 {
public static void main(String[] args)
{
    // Définition des variables
    Scanner sc = new Scanner(System.in);
    String prenom;
    int age;

    // Entrée des valeurs pour prenom et pour age
    System.out.print("Entrez votre prénom : ");
    prenom = sc.nextLine();
    System.out.print("Entrez votre age : ");
    age = sc.nextInt();

    // Affichage de la phrase dynamique
    System.out.println("Je m'appelle " + prenom + ", j'ai " + age + " ans.");

    sc.close();
}
}
