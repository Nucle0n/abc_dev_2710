/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;
public class exo13
{
    public static void main(String[] arg)
    {
        // Définition des variables
        Scanner sc = new Scanner(System.in);
        int cm;
        double m;

        // Saisie de la taille en centimètre
        System.out.print ("Donner une taille en centimètre ? ");   
        cm = sc.nextInt();

        // Conversion en mètre
        m = cm / 100.0;
        
        // Affichage de la taille en mètre
        System.out.println(cm + " cm vaut " + m + " m");
    
        sc.close();
    }
}