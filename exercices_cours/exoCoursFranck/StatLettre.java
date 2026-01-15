
import java.util.Scanner;

public class StatLettre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[26];
        int[] tabfrequence = new int[26];
        String phrase = "Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient désespérément sous ses yeux.";

        do {
            System.out.println("Veuillez saisir une Phrase d'au moins 120 caractères !");
            phrase = sc.nextLine();

        } while (phrase.length() < 10);

        phrase = phrase.toLowerCase();
        phrase = phrase.replace('à', 'a');
        phrase = phrase.replace('é', 'e');
        phrase = phrase.replace('ê', 'e');
        phrase = phrase.replace('è', 'e');
        phrase = phrase.replace('ù', 'u');
        phrase = phrase.replace('ç', 'a');
        phrase = phrase.replace('î', 'i');
        phrase = phrase.replace('â', 'a');
        phrase = phrase.replace('ë', 'e');
        phrase = phrase.replace('ô', 'o');

        char lettre = 'a';
        for (int i = 0; i < alphabet.length; i++) {

            alphabet[i] = lettre;
            lettre++;
        }
        // GestionTab.afficherTableau(alphabet);

        for (int i = 0; i < tabfrequence.length; i++) {

            tabfrequence[i] = 0;
        }
        // GestionTab.afficherTableau(tabfrequence);

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {

                if (alphabet[i] == phrase.charAt(j)) {

                    tabfrequence[i]++;

                }

            }

        }
        // for (int i = 0; i < tabfrequence.length; i++) {
        // if (tabfrequence[i]!=0) {

        // System.out.println("\t La lettre :"+ alphabet[i] + " est présente :"+
        // tabfrequence[i]+ " fois dans la phrase saisie. \n" );
        // }
        // }

        String[][] alphaFrequence = new String[26][2];

        for (int i = 0; i < alphabet.length; i++) {
            alphaFrequence[i][0] = "" + alphabet[i];

        }

        for (int i = 0; i < alphabet.length; i++) {
            alphaFrequence[i][1] = "" + tabfrequence[i];
        }

        StatLettre.triaBulle2Dim(alphaFrequence);

        for (String[] soustableau : alphaFrequence) {
            if (Integer.parseInt(soustableau[1]) > 0)
            System.out.println("lettre alphabet: " + soustableau[0] + " Fréquence d'apparition :" + soustableau[1]);

        }

        sc.close();
    }
    // tri à bulle à deux dim

    public static void triaBulle2Dim(String[][] _tableau2Dim) {

        String tempColAlpha,
                tempColFreq;

        int passage = 0;

        Boolean permut = true;

        while (permut) {

            permut = false;
            passage++;

            for (int i = 0; i < 25; i++) {
                if (Integer.parseInt(_tableau2Dim[i][1]) > Integer.parseInt(_tableau2Dim[i + 1][1])) {
                    permut = true;
                    tempColFreq = _tableau2Dim[i + 1][1];
                    _tableau2Dim[i + 1][1] = _tableau2Dim[i][1];
                    _tableau2Dim[i][1] = tempColFreq;

                    tempColAlpha = _tableau2Dim[i + 1][0];
                    _tableau2Dim[i + 1][0] = _tableau2Dim[i][0];
                    _tableau2Dim[i][0] = tempColAlpha;
                }
            }
        }
    }
}