package exoTierceQuinte;
import java.util.Scanner;

// EXERCICE 4
// Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce
// nombre. Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15
// NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

public class E04 {
    public static void main(String[] args) {
        int nbUser;
        int somme = 0;
        boolean debug = true;
        String dbool;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Mode debug (y/n) : ");
            dbool = sc.nextLine().trim().toLowerCase(); // .trim() pour enlever les espaces, .toLowerCase() pour mettre en minuscule

            if (dbool.equals("y")) {
                debug = true;
                System.out.println("Debug mode [ON]");
                break;
            }

            if (dbool.equals("n")) {
                debug = false;
                System.out.println("Debug mode [OFF]");
                break;
            }

            System.out.println("Erreur de saisie, répondez par y ou n");
        }
        
        System.out.print("Entrez un nombre : ");
        nbUser = sc.nextInt();

        for (int i = 1; i <= nbUser; i++) {
            somme += i;
            if (debug){
                System.out.print(i+" "); //Debug (affichage pour voir chaque nombre intermédiaires)
            }
        }


        System.out.printf( "%ntotal = %d%n",somme);

        sc.close();

    }
}
