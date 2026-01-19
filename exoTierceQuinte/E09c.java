package exoTierceQuinte;

import java.util.Scanner;

public class E09c {
    public static void main(String[] args) {
        
        long nbfactorielle,res;

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier : ");
        nbfactorielle = sc.nextInt();
        
        // res = E09c.factorielleClassique(nbfactorielle);
        // res = E09c.factorielleClassique2(nbfactorielle);
        res = E09c.factorielleCyclique(nbfactorielle);

        System.out.println("Resultat de : "+nbfactorielle+" est : "+res);

        sc.close();
    }

    public static long factorielleClassique(long _nb) {
        long resultat = _nb;
        for (long i = 1; i < _nb; i++) {
            resultat *= i;
        }
        return resultat;

    }

    public static long factorielleClassique2(long _nb) {
        long resultat = 1;
        for (long i = _nb; i > 1; i--) {
            resultat *= i;
        }
        return resultat;

    }

    public static long factorielleCyclique(long _nb){
        if (_nb > 1) {
            // System.out.println(_nb);
            return (_nb * factorielleCyclique(_nb-1));

        } else {
            return 1;
        }

    }

}
