import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class condition { /* Nom de la Classe */



    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/


        int a; //  Déclaration d'une variable a de Type Entier */

        int b; //  Déclaration d'une variable b de Type Entier */

        String message ;
        
        
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          a = clavier.nextInt(); // Affection de la valeur Scanner tapé sur le clavier à la variable a

          b = clavier.nextInt(); // Affection de la valeur Scanner tapé sur le clavier à la variable b


          if(a < b){ /* Condition de l'expression */

            message = "A est supérieur à B";  // Si l'expression est vrai alors on exécute cette instruction

          }else{

            message = "A est inférieur ou égale à B"; // Si l'expression est fausse alors on exécute cette instruction

          }


        System.out.println(message); /* Afficher votre instruction */

        clavier.close();



      /***--------  Fin du code  -------------------****/

  }

}
