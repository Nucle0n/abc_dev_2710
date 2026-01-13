// EXERCICE 3.4 : RECHERCHER UNE LETTRE DANS UNE CHAINE DE CARACTERES
// Soit une chaîne de caractères terminée par le caractère « . ».
// Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée (« a » par exemple) dans cette chaîne.
// Si la chaîne de caractères est vide ou n'est composée que du caractère « . », le message « LA CHAINE EST VIDE » sera affiché.
//
// Proposez un jeu d'essai prévoyant les 3 cas suivants :
//     La phrase est vide
//     La lettre n'est pas présente
//     La lettre est présente une ou plusieurs fois

package exocoursfranck;

import java.util.Scanner;

// public class Ex3_4
// {
//     public static void main(String[] args)
//     {
//         String inUser; //Contiendra la chaine de caractères entrée par User
//         char car;
//         int carCount = 0;
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Entrez une phrase ou un mot. ");

//         // while (tant que inUser ne se termine pas par un.)
//         // {
//         //     System.out.println("Terminez par un \".\" :");
//         //     nUser = sc.nextLine();
//         // }
//         System.out.println("Terminez par un \".\" :");
//         inUser = sc.nextLine();
        
//         System.out.print("Entrez une lettre : ");
//         car = sc.nextLine().charAt(0);

//         for (int i = 0; i < inUser.length(); i++)
//         {
//             if (car == inUser.charAt(i))
//                 carCount += 1;
//         }
//         System.out.println("Le caractère "+car+" apparait "+carCount+" dans la chaîne.");

//         sc.close();

//     }
    
// }

// Corrigée :
public class Ex3_4
{
    public static void main(String[] args)
    {
        boolean trouvePoint     = false,
                trouveLettre    = false;
        int     Nbchar          = 0,
                position        =0,
                depart;
        String  mot,
                chaineString,
                souString;

        char    lettre;
        int[] occurence;
        
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Veuillez saisir une phrase terminée par un point !");
            chaineString    = sc.nextLine();
            chaineString = chaineString.trim();
            depart          = chaineString.length()-1;
            souString       = chaineString.substring(depart, chaineString.length());

            // if (souString   == ".")
            // {
            //     trouvePoint = true;
            // }
            if (souString.equals("."))
            {
                trouvePoint = true;
            }

        }
        while (trouvePoint == false);
        
        if (chaineString.length()==1)
        {
            System.out.println("La chaîne de caractères est vide !");
        }
        else
        {
            chaineString    = chaineString.replace(" ","");
            occurence       = new int[chaineString.length()];
            // chaineString = chaineString.replace("é","e")

            System.out.print("Veuillez saisir une lettre qui sera peut-être dans la phrase : ");
            lettre = sc.nextLine().charAt(0);

            char[]  tabPhrase = new char[chaineString.length()];

            for (int i = 0; i < chaineString.length(); i++) 
            {
                tabPhrase[i] = chaineString.charAt(i);
            }
            
            System.out.print("[ ");
            for (char c : tabPhrase)
            {
                System.out.print(c+ " ");
            }
            System.out.print("]\n");

            for (int i = 0; i < tabPhrase.length; i++)
            {
                if (tabPhrase[i] == lettre)
                {
                    occurence[position] = i+1;
                    trouveLettre = true;
                    position++;
                }
            }
            
            if (trouveLettre == false)
            {
                System.out.println("La lettre n'est pas présente dans la phrase.\n");
            }
            else
            {
                System.out.println(" la lettre est présente dans le tableau de char aux positions suivantes :");
                for (int value :  occurence)
                {
                    if(value != 0)
                    {
                        System.out.print(value+ " ");
                    }
                }
                System.err.println(""); //retour à la ligne pour terminal UNIX
            }

            sc.close();
        }
    }
}

