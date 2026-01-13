import java.util.Scanner;

public class part2JbAlgo1 {
    public static void main(String[] args) {
        //declaration des variables : 
        double a,b; //le type n'étant pas précisé, je les déclare comme double pour cibler tous les cas possibles
        String erreur = "Entrée invalide, veuillez entrer un nombre : ";
        Scanner sc = new Scanner(System.in);

        //initialisationd es valeurs pour a et b
        System.out.print("Votre valeur de a : ");
        while (!sc.hasNextDouble()) {
            System.out.print(erreur);
            sc.next(); // Pour supprimer l'entrée invalide
        }
        a = sc.nextDouble();

        System.out.print("Votre valeur de b : ");
        while (!sc.hasNextDouble()) {
            System.out.print(erreur);
            sc.next();
        }
        b = sc.nextDouble();

        //conditions
        if (a<b) System.out.println("Après comparaison a est inférieur à b");
        else if (a>b) System.out.println("Après comparaison a est supérieur à b");
        else System.out.println("Après comparaison a et b sont égaux");

        sc.close();

    }
    
}
