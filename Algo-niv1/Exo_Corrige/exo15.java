package Corrige;
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
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

    /***--------Donner un nom à votre class -------------------****/

public class exo15 { /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          double amountStart; /*  Déclaration d'une variable de Type décimal */
          String currencyStart; /*  Déclaration d'une variable de Type chaine de caractère */
          String currencyEnd; /*  Déclaration d'une variable de Type chaine de caractère */
          double amountEnd; /*  Déclaration d'une variable de Type décimal */

          Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
              Quel est votre monnaie ? */

         System.out.println("Quel est votre monnaie ?");
         currencyStart = clavier.nextLine().toUpperCase(); 

         System.out.println("Vous voulez la convertir en quelle devise ?");
         currencyEnd = clavier.nextLine().toUpperCase(); 

         System.out.println("Quel est votre montant ?");
         amountStart = clavier.nextDouble(); 



         if(!(currencyStart.equals(currencyEnd)) 
         && 
         (
            
         currencyStart.equals("EUR") || 
         currencyStart.equals("USD") ||
         currencyStart.equals("GBP") 

         ) 
         &&
         (
            
         currencyEnd.equals("EUR") || 
         currencyEnd.equals("USD") ||
         currencyEnd.equals("GBP") 
         
         ) 
         
         )
         
         {

            switch(currencyStart) {

                case "EUR":

                        switch(currencyEnd) {

                            case "USD":
                            amountEnd = amountStart * 1.1092;
                            amountEnd = Math.round(amountEnd*100);
                            amountEnd /=100;
                            System.out.println("Résultat:"+amountEnd);
                            break;

                            
                            case "GBP":
                            amountEnd = amountStart * 0.8419;
                            amountEnd = Math.round(amountEnd*100);
                            amountEnd /=100;
                            System.out.println("Résultat:"+amountEnd);
                            break;

                        }

                  break;

                  case "USD":

                  switch(currencyEnd) {

                      case "EUR":
                      amountEnd = amountStart * 0.9018;
                      amountEnd = Math.round(amountEnd*100);
                      amountEnd /=100;
                      System.out.println("Résultat:"+amountEnd);
                      break;

                      
                      case "GBP":
                      amountEnd = amountStart * 0.7593;
                      amountEnd = Math.round(amountEnd*100);
                      amountEnd /=100;
                      System.out.println("Résultat:"+amountEnd);
                      break;

                  }

            break;     
            
                    case "GBP":

                    switch(currencyEnd) {

                        case "EUR":
                        amountEnd = amountStart * 1.1877;
                        amountEnd = Math.round(amountEnd*100);
                        amountEnd /=100;
                        System.out.println("Résultat:"+amountEnd);
                        break;

                        
                        case "USD":
                        amountEnd = amountStart * 0.9018;
                        amountEnd = Math.round(amountEnd*100);
                        amountEnd /=100;
                        System.out.println("Résultat:"+amountEnd);
                        break;

                    }

            break;      

                default:
                System.out.println("Erreur lors de la conversion"); /* Afficher votre instruction */
                  // code block
              }
              

         }else{

            System.out.println("Les devise sont identiques ou inconnus"); /* Afficher votre instruction */
            
          }


          clavier.close();


        /***--------  Fin du code  -------------------****/

    }

}
