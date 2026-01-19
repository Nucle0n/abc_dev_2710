package exoTierceQuinte;

import java.util.Scanner;

public class E09c {
    public static void main(String[] args) {
        
        long nbfactorielle,res;

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier : ");
        nbfactorielle = sc.nextInt();
        res = E09c.FactorielleClassique2(nbfactorielle);
        System.out.println("Resultat de : "+nbfactorielle+" est : "+res);

        sc.close();
    }

    public static long FactorielleClassique(long _nb) {
        long resultat = 1;

        for (long i = 1; i < _nb; i++) {
            resultat *= i;
        }
        return resultat;

    }

    public static long FactorielleClassique2(long _nb) {
        long resultat = 1;

        for (long i = _nb; i > 1; i--) {
            resultat *= i;
        }
        return resultat;

    }
}
