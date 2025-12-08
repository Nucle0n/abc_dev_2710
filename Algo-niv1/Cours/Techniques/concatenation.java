import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class concatenation { /* Nom de la Classe */



    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/


        String prenom; //  Déclaration d'une variable a de Type Entier */

        String nom; //  Déclaration d'une variable b de Type Entier */
        
        
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          prenom = clavier.nextLine(); // Affection de la valeur Scanner de type Text tapé sur le clavier à la variable prenom

          nom = clavier.nextLine(); // Affection de la valeur Scanner de type Text tapé sur le clavier à la variable nom

        System.out.println("Je m'appelle "+prenom+" "+nom); /* Afficher la phrase avec les concatenations */

        clavier.close();



      /***--------  Fin du code  -------------------****/

  }

}
