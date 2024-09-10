package codeforces.Loops.EasyQuestions;

import java.util.Scanner;

public class DistributingCandyProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        distributeCandy(n);
    }

    private static void distributeCandy(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                if (j % 2 == 1) {
                    System.out.print(i + (j - 1) * n);
                } else {
                    System.out.print(n * n - i + 1 - (j - 2) * n);
                }
            }
            System.out.println();
        }
    }
}