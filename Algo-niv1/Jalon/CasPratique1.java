package Jalon;


import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

/*Cas pratique n° 1 : Me faire un algorithme avec PRINT & SCANNER, permettant de boire une bouteille d’eau d’1L en fonction 

de la quantité d’eau but en CL, si les 1L ne sont pas dépasser alors on affiche un message, « il reste encore X cl d’eau dans la bouteille » 
si l’on dépasse, on affiche « la bouteille d’eau est vide ». Note : c’est en une seule fois donc pas besoin d’une boucle 

Résultat attendu (exemple): 

Combien de centilitre d’eau voulez-vous boire : 

100 

La bouteille est vide  */



    /***--------Donner un nom à votre class -------------------****/

public class CasPratique1 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          int drink; /*  Déclaration d'une variable de Type Entier */
          int bottle = 100; /*  Déclaration d'une variable de Type Entier */

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                                                                    */
          System.out.println("Combien de centilitre d’eau voulez-vous boire : "); /* Afficher votre instruction */

          drink = clavier.nextInt(); 

          if(drink>=bottle){

            System.out.println("La bouteille est vide"); /* Afficher votre instruction */

          }else if(drink==0){

            System.out.println("Vous avez rien but, il reste toujours : "+bottle+"cl"); /* Afficher votre instruction */

          }else{

            bottle -= drink;

            System.out.println("il reste encore "+bottle+"cl d’eau dans la bouteille "); /* Afficher votre instruction */

          }




          clavier.close();


        /***--------  Fin du code  -------------------****/

    }

}