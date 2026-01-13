// EXERCICE 3.2 : BARNABE FAIT SES COURSES
// Barnabé fait ses courses dans plusieurs magasins. Dans chacun, il dépense 1 € de plus que la moitié de ce qu’il possédait en entrant. Dans le dernier magasin, il dépense le solde. Barnabé dépense au moins 1 € dans chaque magasin.
// Soit S un nombre entier représentant la somme dont il disposait au départ (S > 1 euro).
// Représenter l’algorithme permettant de trouver le nombre de magasins dans lesquels il a acheté.

package exocoursfranck;
import java.util.Scanner;
public class Ex3_2 
{
    public static void main(String[] args) {
        //var
        int     Mag     =   0;  //Mag pour compter le nombre de magasins
        int     Smem    =   0;  //Mémoire de la somme d'origine
        float   S       =   0;  //S est le solde de départ de Barnabé, entré par l'utilisateur

        Scanner sc      = new Scanner(System.in);

        System.out.print("Entrez la somme (entier positif) dont dispose Barnabé : ");
        Smem = sc.nextInt();
        S = Smem;
        while (true) {
            if (S >= 2) {
                S = S - (S/2 + 1);
                Mag++;
            }
            else {
                S = 0;
                Mag = Mag +1;
            }
            if (S <= 0)
                break;
        }
        System.out.println("Avec un somme de départ de "+Smem+" EUR, Barnabé peut aheter dans "+Mag+" magasin(s)."  );
        sc.close();
    }
}