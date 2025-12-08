
/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€/ mois
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
  * Quel est votre salaire ?
 * 
 * 150000
 * 
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'apport ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/
package Exo_Corrige;

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo18 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          boolean isCDI; /*  Déclaration d'une variable de Type Booléenne */
          double salary; /*  Déclaration d'une variable de de Type double salaire par mois */
          double amount; /*  Déclaration d'une variable de de type double  montant du prêt*/
          double contribution; /*  Déclaration d'une variable de type double montant de l'apport */
          double estate; /*  Déclaration d'une variable de type double prix de la propriété */
          boolean condition1; /*  Déclaration d'une variable de type double prix de la propriété */
          boolean condition2; /*  Déclaration d'une variable de type double prix de la propriété */
          boolean condition3; /*  Déclaration d'une variable de type double prix de la propriété */


          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
       
          */

          System.out.println("Quel est le montant de votre prêt ?"); /* Afficher votre instruction */
          amount = clavier.nextDouble(); 

          System.out.println("Quel est le montant de votre salaire (par mois) ?"); /* Afficher votre instruction */
          salary = clavier.nextDouble(); 

          System.out.println("Êtes vous en cdi ?"); /* Afficher votre instruction */
          isCDI = clavier.nextBoolean(); 


          System.out.println("Combien avez-vous d'apport ?"); /* Afficher votre instruction */
          contribution = clavier.nextDouble(); 

          System.out.println("Si vous êtes déjà propriétaire d'un bien veuillez me donner sa valeur, sinon mettez 0"); /* Afficher votre instruction */
          estate = clavier.nextDouble(); 

         /* Condition 1 */
          condition1= isCDI && (salary>=3000);

         /* Condition 2 */
           condition2 = contribution >= (amount*0.25);          
           System.out.println("Apport minimum : "+amount*0.25+" euros"); /* Afficher votre instruction */
           System.out.println("Votre apport : "+contribution+" euros"); /* Afficher votre instruction */

         /* Condition 3 */
         condition3 = estate >= (amount*0.75); 
         System.out.println("75% du prêt : "+amount*0.75+" euros"); /* Afficher votre instruction */
         System.out.println("Votre bien : "+estate+" euros"); /* Afficher votre instruction */

         if(((condition1 && condition2) == true) || ((condition2 && condition3)==true)){

          System.out.println("Vous êtes éligible pour obtenir ce prêt de "+amount+" euros"); /* Afficher votre instruction */

         }else{

                        
          System.out.println("Vous n'êtes pas éligible pour obtenir ce prêt de "+amount+" euros"); /* Afficher votre instruction */

         }

         clavier.close();



        /***--------  Fin du code  -------------------****/

    }

}
