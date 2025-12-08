import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


public class scanner { /* Nom de la classe */

    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/


        int a; //  Déclaration d'une variable a de Type Entier */

          
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          a = clavier.nextInt(); // Affection de la valeur Scanner tapé sur le clavier à la variable a


        System.out.println(a); /* Afficher votre instruction */

        clavier.close();

      /***--------  Fin du code  -------------------****/

  }

}
