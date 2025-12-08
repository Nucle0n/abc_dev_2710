package Jalon;


import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

/*Cas pratique n° 2 : 
 
 Me faire un algorithme avec PRINT & SCANNER, qui me permet de calculer le salaire NET à partir du salaire BRUT 

Pour vous aider en France vous avez 23 % de charge social sur le salaire BRUT. 
  
Résultat attendu (exemple) : 

Quel est votre salaire BRUT (en euros) : 

2500 

Votre salaire NET sera de 1925.00 euros 
 

  */



    /***--------Donner un nom à votre class -------------------****/

public class CasPratique2 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          double salaryBRUT; /*  Déclaration d'une variable de Type Décimal */
          
          double salaryNET; /*  Déclaration d'une variable de Type Décimal */
          double chargeSocial = 23; /*  Déclaration d'une variable de Type Entier */

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                                                                    */
          System.out.println("Quel est votre salaire BRUT (en euros) : "); /* Afficher votre instruction */

          salaryBRUT = clavier.nextDouble(); 

          salaryNET = salaryBRUT * (1 - (chargeSocial/100));

          System.out.println("Votre salaire NET est de "+String.format("%.2f", salaryNET)+" euros");

          clavier.close();
        /***--------  Fin du code  -------------------****/

    }

}