/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner;
public class exo11 
{
    public static void main(String[] args)
    {
        // Définition des variables
        Scanner sc = new Scanner(System.in);
        double solde = 3000.0;
        int mret;

        // accueil utilisateur
        System.out.println("bonjour, \nvotre solde actuel est : " +solde+ " EUR \ncombien voulez-vous retirer ? ");

        // saisie du montant à retirer
        mret = sc.nextInt();
        if (mret > solde) System.out.println("Opération refusée, fond insuffissant !");
        else
        {
            solde = solde - mret;
            System.out.println("Retrait de " +mret+ " EUR effectué. \nVotre nouveau solde est de : " +solde+ " EUR");
        }
        sc.close();
    }
}