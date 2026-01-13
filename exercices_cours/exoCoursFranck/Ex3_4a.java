package exocoursfranck;
import java.util.Scanner;
public class Ex3_4a
{
    public static void main(String[] args)
    {
        String  inUser; //Contiendra la chaine de caractères entrée par User
        String  pointVerif;
        char    car;
        int     carCount = 0,
                lastChar;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez une phrase ou un mot. ");

        // while (tant que inUser ne se termine pas par un.)
        // {
        //     System.out.println("Terminez par un \".\" :");
        //     nUser = sc.nextLine();
        // }
        System.out.println("Terminez par un \".\" :");
        inUser = sc.nextLine(); //Utilisateur rentre sa phrase ou son mot
        lastChar = inUser.length()-1; //lastChar prend la longueur de inUser-1 pour se placer juste avant le dernier caractère de la String inUser
        pointVerif = inUser.substring(lastChar,inUser.length()); //On stock dans pointVerif le caractère qui se trouve en dernière position (entre lastChar et la fin de inUser)
        
        //remplacement des principaux accents pour que les lettres soient bien prises en compte.
        inUser = inUser.replace("à","a");
        inUser = inUser.replace("é","e");
        inUser = inUser.replace("è","e");
        inUser = inUser.replace("ê","e");
        inUser = inUser.replace("ë","e");
        inUser = inUser.replace("ï","i");
        inUser = inUser.replace("ù","u");
        inUser = inUser.replace(" ","");
        
        System.out.println(inUser);

        System.out.print("Entrez une lettre : ");
        car = sc.nextLine().charAt(0);//Permet de ne prendre en compte que le premier caractère, si jamais l'utilisateur entrait plus d'un caractère.

        for (int i = 0; i < inUser.length(); i++)//Boucle for, pour parcourir chaque caractère de la chaîne inUser
        {
            if (car == inUser.charAt(i))//dans le cas ou le caractère recherche (contenu dans car) correspond au caractère présent à l'indice i de la chaîne inUser
                carCount += 1; //on ajoute 1 au compteur
        }
        System.out.println("Le caractère "+car+" apparait "+carCount+" dans la chaîne."); //On affiche le résultat, combien de fois le caractère apparraît dans la chaine

        sc.close();

    }
}
