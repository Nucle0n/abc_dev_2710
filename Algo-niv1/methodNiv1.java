import java.util.Scanner; 

public class methodNiv1 { 


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        Scanner clavier = new Scanner(System.in);
        int var1; /* Déclaration */
        int var2;

        int result;

        System.out.println("Var1 :"); /*Affichage & Concaténation */
        var1 = clavier.nextInt();
        System.out.println("Var2 :");
        var2 = clavier.nextInt();

        result = var1+var2; /* Affectation */

        System.out.println("La somme de "+var1+" et "+var2+" vaut "+result); /*Affichage & Concaténation */

        /**   La somme de 1 et 2 vaut 3 */

        result++;
        result--;


        if(!(result<=10)){ /* Opération qui retourne un TRUE */

        /* x est supérieur 10 */ 
        System.out.println(result+" est supérieur 10");

        }else{

            System.out.println(result+" est inférieur ou égal à 10"); /*Affichage & Concaténation */
                                  /* x est inférieur ou égal à 10 */ 
        }


        clavier.close();


    }

}
