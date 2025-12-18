
/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/
package Exo_Corrige;

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo16 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          int age; /*  Déclaration d'une variable de Type Entier l'age du passager */
          int nbsit; /*  Déclaration d'une variable de Type Entier pour le nombre de place */
          double price; /*  Déclaration d'une variable de Type Entier pour le prix du vol */
          double finalPrice; /*  Déclaration d'une variable de Type Entier pour le prix du vol */
          String choice; /* Choix en chaîne de caractère */

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                                                                    */
        System.out.println("Le passager veut-il une classe business (oui/non) ?");
        choice = clavier.nextLine();                                                          

        System.out.println("Quel est l'âge de votre passager ?");
        age = clavier.nextInt(); 

          System.out.println("Le prix du vol :");
          price = clavier.nextDouble(); 

          System.out.println("Nombre de places disponibles :");
          nbsit = clavier.nextInt(); 

        /* Réduction de 20% si le passager est mineur 
        ou Réduction de 40% si le passager est senior de plus 60 ans */

        if(age<18){

            price *= 0.8;
        }

        if(age>60){

            price *= 0.6;   

        }

        /* Réduction de 20% si il y a plus de 60 places disponibles
            Augmentation de 20% si il y a moins de 20 places disponibles */

        if(nbsit>60){

            price *= 0.8;   

        }

        if(nbsit<20){

            price *= 1.2;   

        }

        /* Augmentation de 20% si le passager a choisit la classe business */

        if(choice.equalsIgnoreCase("oui")){

            price *= 1.2; 

        }

        finalPrice = Math.round(price * 100);

        finalPrice /= 100;

          System.out.println("Le prix du vol est de "+finalPrice+" euros"); /* Afficher votre instruction */

        clavier.close();

        /***--------  Fin du code  -------------------****/

    }

}
