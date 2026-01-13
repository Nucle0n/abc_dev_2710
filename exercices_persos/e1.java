
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);


        System.out.print("Compte à rebours à partir de : ");

        i = sc.nextInt();

        while (i>=0){
            System.out.println(i);
            i--;
        }
        sc.close();
    }
    
}
