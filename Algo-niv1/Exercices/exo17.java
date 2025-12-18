/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/
import java.util.Scanner;
public class exo17 
{
    public static void main(String[] args)
    {
        //Définition des variables
        Scanner sc  = new Scanner(System.in);
        double  B7  = 1.645,
                E5  = 1.727,
                E10 = 1.703,
                result = 0,
                i   = 0;
        int     dist;
        String  fuel;

        
        //Afficher les infos pour utilisateur
        System.out.println("\033[33;4m\nInformations sur les carburants ID et tarifs :\033[0m"+"\nGazole        - ID : B7   | Prix : "+B7+" €/l\nSans Plomb 95 - ID : E5   | Prix : "+E5+" €/l\nSans Plomb 98 - ID : E10  | Prix : "+E10+" €/l\n----------------------------------------------\n");

        //Choix utilisateur
        System.out.print("Entrez l'ID de votre carburant (B7 / E5 / E10) : ");
        fuel = sc.nextLine().toUpperCase();
        while (!fuel.equalsIgnoreCase("B7") && !fuel.equalsIgnoreCase("E5") && !fuel.equalsIgnoreCase("E10"))
        {
            System.out.print("Erreur : entrez un ID valide : ");
            fuel = sc.nextLine().toUpperCase();     
        }
        if (fuel.equalsIgnoreCase("B7")) 
            i=5.5;
        if (fuel.equalsIgnoreCase("E5") || fuel.equalsIgnoreCase("E10"))
            i=6.5; 
        System.out.print("Entrez la distance (en km) : ");
        dist = sc.nextInt();
        if (fuel.equalsIgnoreCase("B7")) 
            result = i*dist/100*B7;
        if (fuel.equalsIgnoreCase("E5"))
            result = i*dist/100*E5;
        if (fuel.equalsIgnoreCase("E10"))
            result = i*dist/100*E10;        
        System.out.println("\nPour "+dist+" km, vous allez dépenser en moyenne "+result+" €.\n\n---");
    
        sc.close();
    
    }


}
