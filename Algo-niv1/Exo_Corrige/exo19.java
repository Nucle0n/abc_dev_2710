package Corrige;
/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo19 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          int sec; /*  Déclaration d'une variable de Type Entier */
          String digith="";
          String digitm="";
          String digits="";

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner */

          System.out.println(" Le nombre de seconde :");
             sec = clavier.nextInt();

             int h = sec/3600;
             int m = (sec % 3600)/60;
             int s = (sec % 60);

             if(h<10){

                digith="0";

             }

             if(m<10){

                digitm="0";

             }

             if(s<10){

                digits="0";

             }


          System.out.println(digith+h+" heure(s) "+digitm+m+" minute(s) "+digits+s+" seconde(s)");

          clavier.close();
        /***--------  Fin du code  -------------------****/

    }

}

