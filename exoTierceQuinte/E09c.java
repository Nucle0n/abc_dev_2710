package exoTierceQuinte;

import java.util.Scanner;

public class E09c {
    public static void main(String[] args) {
        
        long nbChevaux,res;
        int choix;
        boolean ordre;
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir le nombre de chevaux partant : ");
        nbChevaux = sc.nextInt();

        System.out.printf("souhaitez vous jouer :%nUn tiercé : 1%nUn quarté : 2%nUn quinté : 3%n");
        choix = sc.nextInt();

        System.out.println("Arrivée dans l'ordre ? (true/false)");
        ordre = sc.nextBoolean();
        switch (choix) {
            case 1:
                if (ordre){
                    res = E09c.nbArrangement(3, nbChevaux);
                    System.out.println("Dans l'ordre , vous avez une chance de gagner sur : " + res);
                }
                else{
                    res = E09c.nbCombinaison(3, nbChevaux);
                    System.out.println("Dans le désordre, vous avez 1 chance de gagner sur : "+ res);
                }
                
                break;
            case 2:
                if (ordre){
                    res = E09c.nbArrangement(4, nbChevaux);
                    System.out.println("Dans l'ordre , vous avez une chance de gagner sur : " + res);
                }
                else{
                    res = E09c.nbCombinaison(4, nbChevaux);
                    System.out.println("Dans le désordre, vous avez 1 chance de gagner sur : "+ res);
                }
                break;
            case 3:
                if (ordre){
                    res = E09c.nbArrangement(5, nbChevaux);
                    System.out.println("Dans l'ordre , vous avez une chance de gagner sur : " + res);
                }
                else{
                    res = E09c.nbCombinaison(5, nbChevaux);
                    System.out.println("Dans le désordre, vous avez 1 chance de gagner sur : "+ res);
                }
                break;
            default:
                throw new AssertionError();
        }

        // res = E09c.factorielleClassique(nbfactorielle);
        // res = E09c.factorielleClassique2(nbfactorielle);
        // res = E09c.factorielleRecursive(nbChevaux);

        // System.out.println("Resultat de : "+nbChevaux+" est : "+res);

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

    public static long factorielleRecursive(long _nb){
        if (_nb > 1) {
            // System.out.println(_nb);
            return (_nb * factorielleRecursive(_nb-1));

        } else {
            return 1;
        }
    }

    public static long nbArrangement(int _nbChevauxJouer, long _nbChevauxPartant){
        return factorielleRecursive(_nbChevauxPartant)/factorielleRecursive(_nbChevauxPartant-(long)_nbChevauxJouer);
    }

    public static long nbCombinaison(int _nbChevauxJouer, long _nbChevauxPartant)  {
        long resultat = factorielleRecursive(_nbChevauxPartant)/(factorielleRecursive(_nbChevauxJouer)*factorielleRecursive((_nbChevauxPartant -(long)_nbChevauxJouer)));
    
        return resultat;
    }

}


