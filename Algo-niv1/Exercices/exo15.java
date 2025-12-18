/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montants doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/
import java.util.Scanner; 

public class exo15
{
    public static void main(String[] arg)
    {
        // Définition des variables :
        Scanner sc = new Scanner(System.in);
        double amount = -1, camount;
        String odevice, cdevice;
        double  euus = 1.16,
                eugb = 0.87,
                useu = 0.86,
                usgb = 0.75,
                gbeu = 1.14,
                gbus = 1.33;
        // Choix de la monnaie en entrée du convertisseur
        System.out.print("Quel est votre monnaie ? (EUR, USD, GBP) : ");
        while (true) 
        { 
            odevice = sc.nextLine().toUpperCase();
            if (odevice.equals("EUR") || ("USD".equals(odevice)) || ("GBP".equals(odevice))) 
                break;
            else
                System.out.print("Erreur, entrez une devise valide (EUR, USD, GBP) : ");
        }
        // Montant à convertir + vérification validité de l'entrée
        System.out.print("Entrez le montant que vous voulez convertir : ");
        while(!(amount >= 0))
        {
            while (!(sc.hasNextDouble()))
            {
                sc.next();
                System.out.print("Erreur, entrez un montant valide : ");
            }
            amount = sc.nextDouble();
            sc.nextLine(); //pourquoi ai-jes besoin de cette ligne ???
            if (!(amount >= 0))
                System.out.print("Erreur, entrez un montant positif : ");
        }
        // Choix de la devise de sortie :
        System.out.print("Vers quelle devise voulez vous effectuer la conversion ? (EUR, USD, GBP) : ");
        while (true) 
        { 
            cdevice = sc.nextLine().toUpperCase();
            if ((cdevice.equals("EUR") || ("USD".equals(cdevice)) || ("GBP".equals(cdevice))) && (!(odevice.equals(cdevice))))
                break;
            else
                System.out.print("Erreur, veuillez entrer une devise valide (EUR, USD, GBP) : (pas la meme que celle donnée initialement.)");
        }
        // Calcul conversion : 
        if (odevice.equals("EUR") && cdevice.equals("USD"))
        {
            camount = amount*euus;
            System.out.println(amount+" EUR = "+camount+" USD");
        }
        if (odevice.equals("EUR") && cdevice.equals("GBP"))
        {
            camount = amount*eugb;
            System.out.println(amount+" EUR = "+camount+" GBP");
        }
        if (odevice.equals("USD") && cdevice.equals("EUR"))
        {
            camount = amount*useu;
            System.out.println(amount+" USD = "+camount+" EUR");
        }
        if (odevice.equals("USD") && cdevice.equals("GBP"))
        {
            camount = amount*usgb;
            System.out.println(amount+" USD = "+camount+" GBP");
        }
        if (odevice.equals("GBP") && cdevice.equals("EUR"))
        {
            camount = amount*gbeu;
            System.out.println(amount+" GBP = "+camount+" EUR");
        }
        if (odevice.equals("GBP") && cdevice.equals("USD"))
        {
            camount = amount*gbus;
            System.out.println(amount+" GBP = "+camount+" USD");
        }
        else 
            System.out.println();

        sc.close();

    }
}
