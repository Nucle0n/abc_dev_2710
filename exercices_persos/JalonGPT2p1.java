import java.util.Scanner;

public class JalonGPT2p1 {
    public static void main(String[] args) {
        int i,N;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entier positif : ");
        N = sc.nextInt();
        
        for ( i = 1; i <= N; i++) System.out.println(i);
        
        sc.close();
    }   
}
