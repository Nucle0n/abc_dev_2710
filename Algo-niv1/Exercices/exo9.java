/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas bon, vous affichez "connexion refusée"
 * 
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
 * Votre adresse ?
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/

import java.util.Scanner;  
public class exo9 {
public static void main(String[] args)     
    {

    // Définition des variables
    Scanner sc = new Scanner(System.in);
    String prenom, nom, mail, passreg, pwconfirm, login, password;;

    // Entrée des valeurs pour prenom, nom, mail et password
    System.out.print("Entrez votre prénom : ");
    prenom = sc.nextLine();
    System.out.print("Entrez votre nom : ");
    nom = sc.nextLine();
    System.out.print("Entrer votre adresse mail : ");
    mail = sc.nextLine();
    System.out.print("Entrez un mot de passe : ");
    passreg = sc.nextLine();
    System.out.print("Confirmez votre mot de passe : ");
    pwconfirm = sc.nextLine();

    //Vérification du password
    if(passreg.equals(pwconfirm))
    {
        System.out.println("merci " + prenom + " " + nom + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + mail + "\n\nPour vous connecter, renseignez votre email : ");
        login = sc.nextLine();
        if(login.equals(mail))
        {
            System.out.println("Entrez votre mot de passe  ");
            password = sc.nextLine();
            if(password.equals(passreg))
                System.out.println("Connexion réussie : bienvenue " + prenom + " " + nom);
            else
                System.out.println("Connexion refusée : mot de passe incorrect");
        }
        else
            System.out.println("Connexion refusée : email incorrect");

    }
    else
        System.out.println("Les mots de passes ne correspondent pas : inscription annulée");
    
    sc.close();

    }
}