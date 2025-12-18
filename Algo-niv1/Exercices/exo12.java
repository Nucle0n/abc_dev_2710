/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;
public class exo12
{
    public static void main(String[] arg)
    {
        // Définition des variables
        Scanner sc = new Scanner(System.in);
        double price, reduc, fprice;

        // Saisie du prix
        System.out.print ("Votre prix ? ");
        price = sc.nextDouble();

        // Saisie de la réduction
        System.out.print ("Votre réduction (en pourcentage %) ? ");
        reduc = sc.nextDouble();

        // Calcul du prix après réduction
        fprice = price - (price * reduc / 100);

        // Affichage du prix après réduction
        System.out.println("Prix après réduction de " +reduc+ "% : " +fprice+ " EUR");
        sc.close();
    }
}