package DSA.first_trimester.patterns;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
