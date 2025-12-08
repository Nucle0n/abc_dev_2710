
/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/
package Exo_Corrige;

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo17 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          int carburant; /*  Déclaration d'une variable de Type Entier */
          int distance; /*  Déclaration d'une variable de Type Entier */
          double cost; /*  Déclaration d'une variable de Type Double pour le coût*/
          double priceLiterGazole = 1.563;
          double priceLiter95 = 1.702;
          double priceLiter98 = 1.777;
          double consoMoy;
          double priceLiter=0.0;

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
 
          */

          System.out.println("Quel est le type de votre carburant ?"); /* Afficher votre instruction */

          carburant = clavier.nextInt(); 

          switch(carburant){

            case 0:
            priceLiter = priceLiterGazole;
            consoMoy = 5.5;
            System.out.println("Vous avez choisi Gasoil");
            break;

            case 1:
            priceLiter = priceLiter95;
            consoMoy = 6.5;
            System.out.println("Vous avez choisi sans plomb 95");
            break;

            case 2:
            priceLiter = priceLiter98;
            consoMoy = 6.5;
            System.out.println("Vous avez choisi sans plomb 98");
            break;

            default:
                System.out.println("Carburant inexistant"); /* Afficher votre instruction */
                return;
              // code block
          }


          System.out.println("Quel est la distance à parcourir (en km) ?"); /* Afficher votre instruction */

          distance = clavier.nextInt(); 

          /*
           *  * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
           */

            cost = ((consoMoy/100.0)*priceLiter)*distance*priceLiter;

            cost = Math.round(cost*100.0);

            cost /= 100;    


            System.out.println("Pour "+distance+" km, vous allez dépenser en moyenne "+cost+" euros"); /* Afficher votre instruction */



        /***--------  Fin du code  -------------------****/

    }

}
