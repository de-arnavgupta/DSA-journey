package DSA.patterns;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Right Angle Triangle
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Right Angle Triangle with space
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
