package DSA.patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++) {
            int num = sc.nextInt();
            for(int j = 1; j <= num; j++) {
                for(int k = num; k > j; k--) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= j; k++) {
                    System.out.print("*");
                    if(k != j) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
