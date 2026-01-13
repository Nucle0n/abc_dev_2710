import java.util.Scanner;

public class trainGPT1 {
    public static void main(String[] args) {
        int i,N;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        N = sc.nextInt();

        // for (i=N;i>=0;i--) System.out.println(i);
        // for (i=N;i<=0;i++) System.out.println(i);
        for (int i =N; i!=0; i=i+(-N/Math.abs(N))) System.out.println(i);

        sc.close();
    }
    
}
