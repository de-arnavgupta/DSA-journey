package DSA.codeforce.loops.easyQuestions.patterns;

import java.util.Scanner;

public class NumberIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //number modified

        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //number

        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
