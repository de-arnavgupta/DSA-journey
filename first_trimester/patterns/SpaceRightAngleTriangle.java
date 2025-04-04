package DSA.first_trimester.patterns;

import java.util.Scanner;

public class SpaceRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= row-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Space Right Angle Triangle Modified
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = row; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
