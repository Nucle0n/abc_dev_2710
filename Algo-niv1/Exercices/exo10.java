/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : L'informatique a besoin des mathématiques ? (V/F)
 * 
 * V
 * 
 * Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)
 * 
 * F
 * 
 * Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)
 * 
 * F
 * 
 * Question 4 : Une table de vérité retourne l'expression algébrique (V/F)
 * 
 * V
 * 
 * Question 5 : Git permet de stocker à distance son travail (V/F)
 * 
 * 
 * V
 * 
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/
import java.util.Scanner;

public class exo10 
{
public static void main(String[] args) 
    {
    // Définition des variables
    Scanner sc = new Scanner(System.in);
    int score = 0;
    String  Q1 = "L'informatique a besoin des mathématiques ? (V/F)", 
            Q2 = "L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)",
            Q3 = "En numération, la base de 10 va de 0 à 10 ? (V/F)", 
            Q4 = "Une table de vérité retourne l'expression algébrique (V/F)",
            Q5 = "Git permet de stocker à distance son travail (V/F)",
            erreur = "Veuillez répondre par V ou F : ",
            reponse;

    // Question 1
    System.out.println(Q1);
        reponse = sc.nextLine();
        while (!reponse.equalsIgnoreCase("V") && !reponse.equalsIgnoreCase("F"))    
        {
            System.out.print(erreur);
            reponse = sc.nextLine();    
        }
        if(reponse.equalsIgnoreCase("V")) score++;
        System.out.println(Q2);
    
    // Question 2
    reponse = sc.nextLine();
        while (!reponse.equalsIgnoreCase("V") && !reponse.equalsIgnoreCase("F"))    
        {
            System.out.print(erreur);
            reponse = sc.nextLine();    
        }
        if(reponse.equalsIgnoreCase("F")) score++;
            System.out.println(Q3);

    // Question 3
    reponse = sc.nextLine();
        while (!reponse.equalsIgnoreCase("V") && !reponse.equalsIgnoreCase("F"))    
        {
            System.out.print(erreur);
            reponse = sc.nextLine();    
        }
        if(reponse.equalsIgnoreCase("F")) score++;
            System.out.println(Q4);

    // Question 4
    reponse = sc.nextLine();
        while (!reponse.equalsIgnoreCase("V") && !reponse.equalsIgnoreCase("F"))    
        {
            System.out.print(erreur);
            reponse = sc.nextLine();    
        }
        if(reponse.equalsIgnoreCase("V")) score++;
            System.out.println(Q5);

    // Question 5
    reponse = sc.nextLine();
        while (!reponse.equalsIgnoreCase("V") && !reponse.equalsIgnoreCase("F"))    
        {
            System.out.print(erreur);
            reponse = sc.nextLine();    
        }
        if(reponse.equalsIgnoreCase("V")) score++;
            System.out.println("Résultat du QUIZZ, vous avez " +score+ " / 5 bonnes réponses.");

    sc.close();

    }
}