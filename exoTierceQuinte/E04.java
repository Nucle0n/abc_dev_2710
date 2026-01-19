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
        
        while (true){
        System.out.print("Mode debug (Y/N) : ");
        dbool = sc.nextLine().toLowerCase();
            while (!dbool.equals("n") || !dbool.equals("y")) {
            System.out.println("Erreur de saisie, répondez par Y ou N");
            }
        sc.next();
        }

        if (dbool.equals("y")){
            debug = true;
            System.out.println("Debug mode [ON]");
        }
        if (dbool.equals("n")){
            debug = false;
            System.out.println("Debug mode [OFF]");
        }
        
        System.out.print("Entrez un nombre : " );
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
