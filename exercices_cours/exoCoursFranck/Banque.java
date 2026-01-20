package exocoursfranck;

import java.util.*;

public class Banque {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double capital;
        int nbmois;

        System.out.println(" Veuiller saisir le capital à emprunter :");
        capital = sc.nextDouble();

        System.out.println("Veuiller saisir le taux d'intérêt annuel ");
        double tauxmensuel = (sc.nextDouble()) / 1200;

        System.out.println("Veuiller saisir la durée dde remboursement (en années)");
        nbmois = (sc.nextInt()) * 12;

        double mensualite = Banque.calculMensualite(capital, nbmois, tauxmensuel);
        System.out.printf("Votre mensualité de rembourserment sera de %.2f Euros ", mensualite);

        int numeroMois = 1;

        double partInteret;
        double partCapital;
        double capitalRestant = capital;

        System.out.println(" tableau d'amortissement du Prêt \n ---------------------------------------------\n");
        
        do {
            partInteret = capitalRestant * tauxmensuel;
            partCapital = mensualite - partInteret;

            // k(n+1)=k(n)- part_Capital(n)
            capitalRestant -= partCapital;

            // part_Interet(n+1) = K(n)*tm

            System.out.printf(
                    "numMois : %d // partIntérêt : %.1f // parCapital : %.1f // capitalRestant: %.0f // mensualité : %.0f  %n",
                    numeroMois, partInteret, partCapital, capitalRestant, mensualite);

            numeroMois++;

        } while (numeroMois <= nbmois);
        // tableau avec utilisation d'une fonction
        
        System.out.println("Voici votre tableau d'amortissement : \n" + Banque.tabAmortissement(mensualite, nbmois, capital, tauxmensuel));

        sc.close();
    }

    private static double calculMensualite(double _capital, int _nbmois, double _tauxmensuel) {

        // Q= (1-(1+ tm )puissance-n)
        // a= K x tm/Q

        double Q = (1 - Math.pow((1 + _tauxmensuel), -_nbmois));
        double mensualite = (_capital * _tauxmensuel) / Q;

        return mensualite;

    }

    public static String tabAmortissement(double _mensualite, int _nbmois, double _capital, double _tauxmensuel) {

        String chaineResult = "numero de mois \t  part intérêt \t part capital \t capital restant du \t mensualité \n";

        double part_Interet = _capital * _tauxmensuel;
        double part_Capital = _mensualite - part_Interet;
        double capital_Restant = _capital;

        for (int i = 0; i <= _nbmois; i++) {
            chaineResult += i + " \t\t" + arrondi(part_Interet, 1) + " \t\t" + arrondi(part_Capital, 1) + "\t\t" + Math.round(capital_Restant) + "\t\t\t" + ((i != _nbmois) ? Math.round(_mensualite) : 0) + "\n";
            capital_Restant -= part_Capital;
            part_Interet = capital_Restant * _tauxmensuel;
            part_Capital = _mensualite - part_Interet;
        }

        return chaineResult;

    }

    public static double arrondi(double nb, int nv) {

        return (double) ((long) (nb * Math.pow(10, nv) + 0.5)) / Math.pow(10, nv);

    }
}