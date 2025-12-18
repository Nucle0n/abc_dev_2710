
import java.util.Scanner;

public class exo_cours_1 {

    public static void main(String[] args) {
        int a, b, somme;
        Scanner sc = new Scanner(System.in);
        System.out.print("Définissez la valeur de a : ");
        a = sc.nextInt();
        System.out.print("définissez la valeur de b : ");
        b = sc.nextInt();
        somme = a + b;

        if (somme > 10) {
            System.out.println("a + b = " + somme + " la somme est supérieure à 10");
        } else if (somme < 10) {
            System.out.println("a + b = " + somme + " la somme est inférieure à 10");
        } else {
            System.out.println("a + b = " + somme + " la somme est égale à 10");
        }

        sc.close();
    }
}
