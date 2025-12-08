package Jalon;


import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

/*
 
Cas pratique n°3 : Vous vous souvenez du jalon d’Algèbre de Boole sur l’assurance. Me faire un algorithme avec PRINT & SCANNER, qui permet de tester si vous êtes éligibles ou non à la suite d’un accident sur l’autoroute pour le remplacement de votre véhicule selon votre assureur, en fonction des conditions suivantes : 

-Rouler à moins 130 km/h 

-Ne pas être placer derrière le véhicule entrer en collision 

-Si vous avez plus de 150 000 km au compteur, votre contrôle technique doit dater maximum 2 ans 

-Si vous avez moins de 150 000 km au compteur, votre contrôle technique doit dater maximum 5 ans 

Résultat attendu (exemple) : 

Le véhicule roulait à quelle vitesse : 

110 

Etiez-vous derrière le véhicule en collision : 

FALSE 

Vous avez combien de kilomètre au compteur : 

78000 

A combien d’années date votre dernier contrôle technique ( 0 si il est moins d’1 an) : 

1 


  */



    /***--------Donner un nom à votre class -------------------****/

public class CasPratique3 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

      
          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                                       
          /***--------  Début du code  -------------------****/
          System.out.println("Le véhicule roulait à quelle vitesse ? :  "); /* Afficher votre instruction */

          int vitesse = clavier.nextInt(); /*  Déclaration d'une variable de Type Entier avec Scanner */
            
          System.out.println("Etiez-vous derrière le véhicule en collision ? :  "); /* Afficher votre instruction */

          Boolean arriere = clavier.nextBoolean();

          System.out.println("Vous avez combien de kilomètre au compteur ? :  "); /* Afficher votre instruction */

          double compteur = clavier.nextDouble();

          System.out.println("A combien d’années date votre dernier contrôle technique ( 0 si il est moins d’1 an) "); /* Afficher votre instruction */

          int annee = clavier.nextInt();

          Boolean condition1 = vitesse < 130;
          Boolean condition2 = (arriere != true);
          Boolean souscondition31 = ((compteur >= 150000)&&(annee<=2));
          Boolean souscondition32 = ((compteur < 150000)&&(annee<=5));
          Boolean condition3 = souscondition31 || souscondition32;

          if(condition1 && condition2 && condition3){

              System.err.println("Au vu des éléments vous êtes bien éligibles pour le remplacement de votre voiture ");

          }else{

              System.err.println("Au vu des éléments vous êtes inéligibles pour le remplacement de votre voiture ");
              
          }

          clavier.close();



        /***--------  Fin du code  -------------------****/

    }

}