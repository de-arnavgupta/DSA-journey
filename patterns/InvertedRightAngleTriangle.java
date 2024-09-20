package DSA.patterns;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Inverted Right Angle Triangle
        int row = sc.nextInt();
        for(int i = row; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Right Angle Triangle with space
        int rows = sc.nextInt();
        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
                if(j<i){
                    System.out.print(" ");
                }
            }
            if(i != 1){
                System.out.println();
            }
        }
    }
}
