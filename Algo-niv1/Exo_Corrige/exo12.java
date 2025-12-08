package Corrige;
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

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo12 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          double price; /*  Déclaration d'une variable de Type Entier, pour le prix */
          int reduction; /*  Déclaration d'une variable de Type Entier , pour le pourcentage */
          double pricereduc;


          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner */

          System.out.println("Votre prix ?");

          price = clavier.nextDouble();

          System.out.println("Votre réduction (en pourcentage %)");

          reduction = clavier.nextInt();

          price = Math.round(price*100);  /*  Faire deux chiffre après la virgule */

          price /=100.0;

          System.out.println("Votre prix :"+price+" euros");        

          pricereduc = price * (1-reduction/100.0);// Attention mettre 100.0 pour définir le résulat en décimal sans arrondir

          System.out.println("Votre prix après réduction :"+pricereduc+" euros");    

          System.out.println("Votre prix de "+price+" euros après une réduction de "+reduction+"% vaut "+pricereduc+" euros");         

          clavier.close();





        /***--------  Fin du code  -------------------****/

    }

}

