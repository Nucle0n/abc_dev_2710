import java.util.Scanner;

/*  Voici comment marche le switch */

public class exo_cours_switch {

    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in); //* Initialsiation du scanner */

        int age, cat;
        System.out.println("Donnez votre âge :");
        age = sc.nextInt();
        
        
        while (age < 0 ) 
        {
            System.out.println("Erreur, veuillez entrer un âge valide :");
            age = sc.nextInt();
        }

        if      (age >= 0   && age < 4)      cat = 1;
        else if (age >= 4   && age < 9)      cat = 2;
        else if (age >= 9   && age < 13)     cat = 3;
        else if (age >= 13  && age < 18)     cat = 4;
        else if (age >= 18  && age < 25)     cat = 5;
        else if (age >= 25  && age < 45)     cat = 6;
        else if (age >= 45  && age < 60)     cat = 7;
        else                                 cat = 8;

         Scanner clavier = new Scanner(System.in); /* Initialisation du scanner */

        switch(cat){ /* On initialise le switch avec la variable age , on va tester si age à les valeurs suivantes */
            /* En fonction des valeurs le message change */
            case 1 :
                System.out.println("Vous êtes un bébé");
                break;
            case 2:
                System.out.println("Vous êtes un enfant");
                break;
            case 3:
                 System.out.println("Vous êtes un pré-ados");
                break;
            case 4:
                 System.out.println("Vous êtes un Adolescents");
                break;
            case 5 :
                 System.out.println("Vous êtes un jeune Adulte");
                break;
            case 6 :
                 System.out.println("Vous êtes un adulte");
                break;
            case 7 :
                 System.out.println("Vous êtes un adulte mure");
                break;
            case 8 :
                if (age >= 60)
                 System.out.println("Vous êtes un senior");
                break;
            default:
                System.out.println("Erreur");
                break;
        }
        clavier.close();     
    }   
}
