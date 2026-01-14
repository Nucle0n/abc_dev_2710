/* Exercice 3.3 : Dénombrer les lettres de l'alphabet dans un tableau
Lire un texte d'au moins 120 caractères (à contrôler).
Compter et afficher le nombre d'occurrences (d'apparitions) de chacune des lettres de l'alphabet */

package exocoursfranck;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class recherche_lettre {
    public static void main(String[] args) {
        
        char[]  alphabet     = new char[26];
        char    lettre;
        int[]   tabOccurences = new int[26];
        int     i; // indice dans les tableaux
        int     indice; //
        String  phrase;
        Pattern pattern;
        /*
        En se réveillant un matin, Gregor Samsa découvrit qu'il n'était plus un homme mais un insecte monstrueux, prisonnier d'une carapace sombre, obligé d'apprendre à aimer la poussière sous son lit tout en gardant, bien cachée sous ses pattes fragiles, une humanité que personne ne semblait plus vouloir remarquer.
        */

        Scanner sc = new Scanner(System.in);
        
        do {
            // On demande à l'utilisateur d'entrer une phrase d'au moins X caractères
            System.out.println("Veuillez saisir une phrase d'au moins 20 caractères !");
            phrase = sc.nextLine();
        }
        // tant qu'il n'a pas au moin le nombre de caractère requis, on recommence
        while (phrase.length() < 20);

        // On normalise la phrase pour bien prnedre en compte tous les caractères, même accentués
        phrase  = phrase.toLowerCase();
        phrase  = Normalizer.normalize(phrase, Normalizer.Form.NFD);
        pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        phrase  = pattern.matcher(phrase).replaceAll("");

        System.out.println("phrase normalisée : \n" + phrase);
        
        // On créer un tableau de référence contenant chaque lettre de l'alphabet et on l'affiche
        lettre = 'a';
        
        for (i = 0; i < alphabet.length; i++) {
        alphabet[i] = lettre;
        lettre++;
        }

        Exp2_3_4.afficherTableau(alphabet);

        // On créer un tableau qui servira a fficher le nombre d'occurences de chaque lettre
        for (i = 0; i < tabOccurences.length; i++) {
            tabOccurences[i] = 0; // Pour le moment on le rempli avec des 0
        }

        // On parcourt chaque caractère de la phrase utilisateur préalablement normalisée
        for (i = 0; i < phrase.length(); i++) {
            char actuel = phrase.charAt(i); // A chaque boucle on place la caractère actuel dans une variable

            // On vérifie si le caractère est bien une lettre (on ignore espaces et ponctuation)
            if (actuel >= 'a' && actuel <= 'z') {
                // On calcule l'indice : 'a'-'a'=0, 'b'-'a'=1, etc.
                indice = actuel - 'a';
                
                // On incrémente la case correspondante dans le tableau de fréquence
                tabOccurences[indice]++;
            }
        }
        Exp2_3_4.afficherTableau(tabOccurences);

        System.out.println("_".repeat(52) + "\n"); //juste pour séparer l'affichage des infos et l'affichage du résultat

        // Afficher le résultat avec retour à la ligne
        for (i = 0; i < tabOccurences.length; i++) {
            if (tabOccurences[i] !=0) {
                System.err.println(alphabet[i] + " : " + tabOccurences[i]);
            }
        }

    }
}
