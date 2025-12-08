
/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
*/
package Exo_Corrige;

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo14 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          boolean a; /*  Déclaration d'une variable de Type Booléen */

          boolean b; /*  Déclaration d'une variable de Type Booléen */

          boolean c; /*  Déclaration d'une variable de Type Booléen */

          boolean result;


          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner */
          
          System.out.println("a est TRUE ou FALSE"); /* Afficher votre instruction */

          a = clavier.nextBoolean(); 

          System.out.println("b est TRUE ou FALSE"); /* Afficher votre instruction */

          b = clavier.nextBoolean(); 

          System.out.println("c est TRUE ou FALSE"); /* Afficher votre instruction */

          c = clavier.nextBoolean(); 

          result = a || b && !c;

          System.out.println("Résultat :" + result); /* Afficher votre instruction */



        /***--------  Fin du code  -------------------****/

    }

}

