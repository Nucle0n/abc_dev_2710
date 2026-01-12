package exocoursfranck;

// Exercice 3.1 : Rechercher un nombre dans un tableau
// Soit un tableau de nombres triés par ordre croissant.
// Chercher si un nombre donné N figure parmi les éléments.
// Si oui, indiquer la valeur de l'indice correspondant. Sinon, indiquer « Non trouvé

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exp2_3_1 {
    public static void main(String[] args) {
        // Variables principales
        int nUser; // Variable pour le nombre qu'entrera l'utilisateur
        int pos = 0; // Variable qu'on utilisera pour définir la position de nUser (si présent) dans le tableau.
        int count = 0; // Variable utilisé pour compter combien de fosi le nombre recherhé apparaît dans tableau
        boolean found = false; // Boolean pour confirmer si nUser est présent ou non dans le tableau

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        // Construction du tableau
        int nbCases = rng.nextInt(2, 21); // On créer la variable "nbCases" et on lui attribue tout desuite une valeur entre 2 et 20
        int[] tab = new int[nbCases]; // On créer le tableau, et on lui donne comme taille "nbCases" (soit un nombre aléatoire de cellules entre 2 et 20)
        for (int i = 0; i < tab.length; i++) { // boucle for afin pour passer sur chaque case du tableau, j'aurais pu utiliser nbCases à la place de "tab.length"
            tab[i] = rng.nextInt(0, 101); // On attribue une valeur random (entre 0 et 100) à la case du tableau d'indice "i"
        }

        // (DEBUG) Affichage des données pour vérifier que tout fonctionne bien
        int lengthVerif = Arrays.toString(tab).length() + 28;
        if (lengthVerif < 42) {
            lengthVerif = 42;
        }
        System.out.println("\033[90m=".repeat(lengthVerif) + "\033[0m"); // barre supérieure

        System.out.println("\033[36;1mDEBUG :\033[0m"); // titre fenêtre DEBUG

        System.out.print("\033[34;3mEtat d'origine du tableau : \033[0m"); // Affichage contenu du tableau avant triage
        System.out.println("\033[33;1m" + Arrays.toString(tab) + "\033[0m");

        System.out.print("\033[34;3mNombre de cellules dans le tableau = \033[0m"); // Confirmation du nombre de cellules du tableau
        System.out.println("\033[33;1m" + tab.length + "\033[0m");

        System.out.print("\033[34;3mVérification de la valeur dans nbCases : \033[0m");// Confirmation que nCase est bien égale à "tab.length"
        System.out.println("\033[33;1m" + nbCases + "\033[0m");

        System.out.print("\033[34;3mtoString(tab).length = \033[0m"); // Pour voir combien de caractère vaut l'affichage du tableau et de son contenu
        System.out.println("\033[33;1m" + lengthVerif + "\033[0m");

        System.out.println("\033[90m=".repeat(lengthVerif) + "\033[0m"); // barre inférieure

        // Début de la partie demandée dans l'énoncé
        System.out.println("Données du tableau dans l'ordre croissant :");

        Arrays.sort(tab); // Trie les valeurs contenues dans chaque case du tableau dans l'ordre croissant
        System.out.println(Arrays.toString(tab)); // affichage du contenu du tableau après triage
        System.out.print("\nEntrez un nombre entier entre 0 et 100 : "); // On demande a l'utilisateur de choisir un

        nUser = sc.nextInt(); // Scanner pour lire l'entrée utilisateur
        
        for (int i = 0; i < nbCases; i++) { // Une boucle for afin de parcourir chaque case du tableau
            if (tab[i] == nUser) { // On vérifie si le nombre entré par l'utilisateur est égale à la valeur se trouvant dans le tableau à la case d'indice "i"
                //found = true;
                pos += (i + 1) + " ";
                count++;
            }
        if (count > 0){
            System.out.printf("%d apparait %d fois dans le tableau, position(s) : %s",nUser, count, pos);

        }
        else {
            System.out.printf("Le nombre %d n'est pas présent dans le tableau",nUser);
        }
        }


        sc.close();
    }
}

// corrigé :
// import java.util.*;

// public class SearchNumber {

// public static void main(String[] args) throws Exception {

// int nbcase;
// Scanner sc = new Scanner(System.in);

// int saisieU;
// System.out.println("Combien de valeur voulez saisir dans un tab :?");
// nbcase = sc.nextInt();

// int[] monTab = new int[nbcase];
// int[] occurence = new int[nbcase];
// String chaineVal = "";
// Random monAlea = new Random();
// String chaineVal2 = "";
// for (int i = 0; i < monTab.length; i++) {
// monTab[i] = monAlea.nextInt(101);
// }

// Arrays.sort(monTab);

// System.out.print("[");
// for (int el : monTab) {

// System.out.print(el + " ");

// }

// System.out.println("]");
// System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
// saisieU = sc.nextInt();

// boolean trouve = false;
// // int position = 0;
// int numOcurrence = 0;

// for (int i = 0; i < monTab.length; i++) {
// if (monTab[i] == saisieU) {

// trouve = true;

// occurence[numOcurrence] = i + 1;
// numOcurrence++;

// }

// }

// if (!trouve) {
// System.out.println(" Le nombre saisie n'est pas dans la tableau !");
// } else {

// for (int position : occurence) {

// if (position != 0) {
// chaineVal += position + ", ";
// }

// }

// for (int position : occurence) {

// if (position == 0) {
// continue;
// } else {
// chaineVal2 += position + ", ";
// }

// }

// String souString = chaineVal.substring(0, chaineVal.length() - 2);
// String souString2 = chaineVal2.substring(0, chaineVal2.length() - 2);
// System.out.println("version avec Continue :" + souString2);
// System.out.print("Le nombre se trouve dans le tableau à la (aux) position(s)
// :" + souString);

// }
// sc.close();
// }
// }