package DSA.first_trimester.patterns;

import java.util.Scanner;

public class StarsAtOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                if(j % 2 != 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
