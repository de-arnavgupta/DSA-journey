package DSA.patterns;

import java.util.Scanner;

public class StarAtEvenNumberAtOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++) {
            int num = 1;
            for(int j = 1; j <= i; j++) {
                if(j % 2 != 0) {
                    System.out.print(num);
                    num++;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
