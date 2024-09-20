package DSA.loops.easyQuestions;

import java.util.Scanner;

public class PrintingInDifferentOrderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 2; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(1);
        }
    }
}
