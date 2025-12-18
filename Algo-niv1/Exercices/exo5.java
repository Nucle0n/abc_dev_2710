/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser par C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/

import java.util.Scanner;
public class exo5 {
    public static void main(String[] args)
    {
    // Définition des variables
    Scanner sc = new Scanner(System.in);
    double a, b, c;
    double equation;

    // Entrée des valeurs pour a , b et c
    System.out.print("A = ");
        a = sc.nextDouble();
    System.out.print("B = ");
        b = sc.nextDouble();
    System.out.print("C = ");
        c = sc.nextDouble();

    // Calcul du résultat
    equation = a * b / c;
   
    // Afficher le résultat et vérifier si "equation" est inférieur, supérieur, ou égal à 10
    if (equation < 10) 
    {
    System.out.println("Equation = " + equation + "\nEquation est inférieur à 10");        
    }
    else if (equation > 10)
    {
    System.out.println("Equation = " + equation + "\nEquation est supérieur à 10");        
    }
    else
    {
    System.out.println("Equation = 10");
    }
 
    sc.close();

    }
}
