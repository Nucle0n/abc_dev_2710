package exocoursfranck;

import java.util.Scanner;

public class test_area {

    public static void main(String[] args) {
        
        int height,
            width;

        Scanner sc = new Scanner(System.in);


        System.out.print("Quelle hauteur souhaitez vous : ");
        height = sc.nextInt();
        width = height*2;
        System.out.println("DEBUG");
        System.out.printf("Height :%d%nWidth:%d%n",height,width);

    }
}
