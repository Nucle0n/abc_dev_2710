/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/
import java.util.Scanner;
public class exo16
{
    public static void main(String[] args)
    {
        // Définition des variables
        Scanner sc = new Scanner(System.in);
        int     age,
                sits = 50;
        double  rd, //reduction mineur/senior
                rs, //reduction si plus de 60 places dispo
                rr, //
                ab, //augmentation Business Class
                as; //augmentation si moins de 20 places dispo
        double  initp = 1000,
                finalp;
        String  business;

        // instructions
        System.out.println("Entrez l'âge du passager : ");
        age = sc.nextInt();

        System.out.print("Voager en Business Class ?  (oui/non) ");
        business = sc.nextLine().toLowerCase();

        // conditions
        if (age < 18) rd = 0.2;
            else if (age >= 60) rd = 0.4;
        else rd = 0;

        if (business.equalsIgnoreCase("oui")) ab = 0.2;
        else ab = 0;

        if (sits > 60) rs = 0.2;
            else if (sits < 20) 

        finalp = initp - initp * rd + initp * ab - initp * rs + initp*ab;

        // message :
        System.out.println("Prix pour votre billet : " + finalp);
        System.out.println("Nombre de places restantes : " +sits);







 








        sc.close();
    }

}
