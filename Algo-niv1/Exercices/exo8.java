/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/

import java.util.Scanner;  
public class exo8 {
public static void main(String[] args)     
    {

    // Définition des variables
    Scanner sc = new Scanner(System.in);
    String prenom, nom, mail, password, pwconfirm;

    // Entrée des valeurs pour prenom, nom, mail et password
    System.out.print("Entrez votre prénom : ");
    prenom = sc.nextLine();
    System.out.print("Entrez votre nom : ");
    nom = sc.nextLine();
    System.out.print("Entrer votre adresse mail : ");
    mail = sc.nextLine();
    System.out.print("Entrez un mot de passe : ");
    password = sc.nextLine();
    System.out.print("Confirmez votre mot de passe : ");
    pwconfirm = sc.nextLine();

    //Vérification du password
    if(password.equals(pwconfirm))
    {
    System.out.println("merci " + prenom + " " + nom + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + mail);
    }
    else
    {
    System.out.println("Les mots de passes ne correspondent pas : inscription annulée");
    }
    
    sc.close();

    }
}