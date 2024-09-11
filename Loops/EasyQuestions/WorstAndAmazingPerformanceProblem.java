package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class WorstAndAmazingPerformanceProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        int amazingPerformances = 0;

        for (int i = 0; i < n; i++) {

            int score = scanner.nextInt();

            if (score > maxScore) {
                maxScore = score;
                amazingPerformances++;

            }
            if (score < minScore) {
                minScore = score;
                amazingPerformances++;
            }
        }

        System.out.println(amazingPerformances - 2);
    }
}