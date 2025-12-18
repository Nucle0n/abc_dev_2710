/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo7 {
    public static void main(String[] args)
    {
    // Définition des variables
    Scanner sc = new Scanner(System.in);
    Boolean reponse;
    String input;

    // Entrée de la valeur pour reponse
    System.out.print("Do you speak english ? (Y/N) ");
    while (true)
    {
        input = sc.nextLine().trim();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) 
        {
            reponse = true;
            break;
        }
        if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) 
        {
            reponse = false;
            break;
        }
        System.out.print("Please enter Y or N: ");
    }
    // Vérification de la réponse et affichage du message approprié
    if(reponse)
        System.out.println("Nice to meet you");
    else
        System.out.println("So learn english !");

    sc.close();

    }
}