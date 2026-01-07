package exocoursfranck;
// Exercice 2.6 : Ma bicyclette

// Réalisez l’algorithme et le programme correspondant au texte ci-dessous :
// S'il fait beau demain, j'irai faire une balade à bicyclette.
// Je n'ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n'est-elle plus en parfait état de fonctionnement.
// Si c'est le cas, je passerai chez le garagiste avant la balade. J'espère que les réparations seront immédiates sinon je
// devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n'est pas
// utilisable, j'irai à pied jusqu'à l'étang pour cueillir les joncs.
// S'il ne fait pas beau, je consacrerai ma journée à la lecture. J'aimerais relire le 1er tome de Game of Thrones. Je pense
// posséder ce livre, il doit être dans la bibliothèque du salon. Si je ne le retrouve pas, j'irai l’emprunter à la bibliothèque
// municipale. Si le livre n'est pas disponible, j'emprunterai un roman policier. Je rentrerai ensuite directement à la
// maison.
// Dès que j'aurai le livre qui me convient, je m'installerai confortablement dans un fauteuil et je me plongerai dans la
// lecture.


import java.util.Random;
import java.util.Scanner;
public class Exp2_2_6
{
    public static void main(String[] args)
    {
        boolean beauTemps,
                veloOK,
                reparImmed,
                livrePossede,
                livreDispo;
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        System.out.print("Fait-il beau demain ? (true/false) : ");
        beauTemps = sc.nextBoolean();

        if (beauTemps)
        {
            System.out.println("je vais voir dans quel état est mon vélo...");
            veloOK = rng.nextBoolean();
            if (veloOK)
            {
                System.out.println("Le vélo est en bon état, je pars faire une balade à vélo.");
            }
            else
            {
                System.out.println("Mon vélo n'est pas en état, je passe chez le garagiste.");
                reparImmed = rng.nextBoolean();
                if (reparImmed)
                {
                    System.out.println("Les réparations sont immédiates. Je pars faire une balade à vélo.");
                }
                else
                {
                    System.out.println("La réparation du vélo va nécéssiter beaucoup de temps. Je renonce à la balade en vélo. Je vais à pied jusqu'à l'étang pour cueillir les joncs.");
                }
            }
        }
        else
        {
            System.out.println("Je consacre ma journée à la lecture.");
            System.out.print("Le 1er tome de Game of Thrones est il dans ma bibliothèque ? (true/false) : ");
            livrePossede = sc.nextBoolean();
            if (livrePossede)
            {
                System.out.println("Je m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
            }
            else
            {
                System.out.println("Je vais à la bibliothèque municipale.");
                Random rng = new Random();
                livreDispo = rng.nextBoolean();
                if (livreDispo)
                {
                    System.out.println("Le livre est disponible.\nJe rentre chez moi, m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
                }
                else
                {
                    System.out.println("Le livre n'est pas disponible. \nJ'emprunte un roman policier.\nje rentre chez moi, m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
                }
            }
        }


        sc.close();
    }
}