package DSA.patterns;

import java.util.Scanner;

public class NumberAndSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            System.out.print("*");
            for(int j = 1; j <= row-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //Star and space modified
        System.out.println();
        for(int i = 1; i <= row; i++) {
            System.out.print("*");

            for(int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
