// EXERCICE 3.4 : RECHERCHER UNE LETTRE DANS UNE CHAINE DE CARACTERES
// Soit une chaîne de caractères terminée par le caractère « . ».
// Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée (« a » par exemple) dans cette chaîne.
// Si la chaîne de caractères est vide ou n'est composée que du caractère « . », le message « LA CHAINE EST VIDE » sera affiché.
//
// Proposez un jeu d'essai prévoyant les 3 cas suivants :
//     La phrase est vide
//     La lettre n'est pas présente
//     La lettre est présente une ou plusieurs fois

package exoCoursFranck;

import java.util.Scanner;

public class Ex3_4 
{
    public static void main(String[] args) 
    {
        String inUser; //Contiendra la chaine de caractères entrée par User
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez une phrase ou un mot, terminez par un \".\" :");
        inUser = sc.nextLine();

        // sc.nextLine().charAt(0);

        String[] uStrings = new String[inUser];


        sc.close();

    }
    
}
