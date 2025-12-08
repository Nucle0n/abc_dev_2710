package Corrige;
/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/


import java.util.Scanner;
 
public class exo20 {
 
 
    public static void main(String[] args) {

        final int TOTAL_VOTANTS = 150000;

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Combien de gens ont voté pour Joseline Inutile ?");
        int votesInutile = scanner.nextInt();
       
        System.out.println("Combien de gens ont voté pour Vincent Escreau ?");
        int votesEscreau = scanner.nextInt();
       
        int totalVotes = votesInutile + votesEscreau;
        int votesBlancs = 0;
       
        if (totalVotes > TOTAL_VOTANTS) {
            System.out.println("Erreur : Le total des votes dépasse le nombre de votants !");
            return;

        } else if (totalVotes <= TOTAL_VOTANTS) {
            votesBlancs = TOTAL_VOTANTS - totalVotes;
            System.out.println("Vous avez " + votesBlancs + " d'abstentions, ils seront compté nul");
        }
       
        int totalValides = votesInutile + votesEscreau;
        double pourcentageInutile = 0;
        double pourcentageEscreau = 0;
       
        if (totalValides > 0) {
            pourcentageInutile = (double) votesInutile / totalValides * 100;
            pourcentageEscreau = (double) votesEscreau / totalValides * 100;
        }

        System.out.println("\nJoseline Inutile : " + String.format("%.2f", pourcentageInutile) + "%");
        System.out.println("Vincent Escreau : " + String.format("%.2f", pourcentageEscreau) + "%\n");
       
       
        if (pourcentageInutile > 60) {
            System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse");
        } else if (pourcentageEscreau > 60) {
            System.out.println("Vincent Escreau est le nouveau maire de Mulhouse");
        } else {
            System.out.println("Aucun candidat n'a obtenu plus de 60%, un second tour sera nécessaire");
        }
       
        scanner.close();
    }
}