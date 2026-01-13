// Déclare un tableau de 3 entiers
// Met les valeurs 10, 20, 30 dans le tableau
// Affiche les 3 valeurs une par ligne

public class Tableaux1 {
    public static void main(String[] args) 
    {
        int[] monTab = new int[3]; //On déclare un tableau de 3 entiers
        monTab[0] = 10; //On attribue 10 pour l'entier en position 1 (indice 0)
        monTab[1] = 20; //On attribue 10 pour l'entier en position 2 (indice 1)
        monTab[2] = 30; //On attribue 10 pour l'entier en position 3 (indice 2)

        for (int i = 0; i < monTab.length; i++) //On créer une boucle pour afficher le contenu du tableau. On va de 0 à "monTab.length" c'est à dire la longueur du tableau, on incrémente i à chaque tour pour parcourir totues les cases du tableau. 
        {
            System.out.println(monTab[i]);//On affiche le contenu de la cellule monTab d'indice i (comme i parcours toutes les cases, i equivaut à l'indice, c'est pourquoi plutôt que d'indiquer directement l'indice 0,1 ou 2, on met i)
        }
    }
}
