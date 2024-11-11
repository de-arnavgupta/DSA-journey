package DSA.first_trimester.basicQuestions.pattern;

import java.util.Scanner;

public class DiamondPatterns {

    public static void printDiamondPattern(int t, int[][] testCases) {
        for (int caseIdx = 0; caseIdx < t; caseIdx++) {
            int r = testCases[caseIdx][0];
            int c = testCases[caseIdx][1];
            int s = testCases[caseIdx][2];

            for (int row = 0; row < r; row++) {
                for (int i = 0; i < 2 * s; i++) {
                    StringBuilder line = new StringBuilder();
                    for (int col = 0; col < c; col++) {
                        for (int j = 0; j < 2 * s; j++) {
                            if (i + j == s - 1) {
                                line.append('/');
                            } else if (j - i == s) {
                                line.append('\\');
                            } else if (i - j == s) {
                                line.append('\\');
                            } else if (i + j == 3 * s - 1) {
                                line.append('/');
                            } else {
                                line.append('.');
                            }
                        }
                    }
                    System.out.println(line);
                }
            }
            if (caseIdx < t - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();
        int[][] testCases = new int[t][3];

        for (int i = 0; i < t; i++) {
            testCases[i][0] = scanner.nextInt();
            testCases[i][1] = scanner.nextInt();
            testCases[i][2] = scanner.nextInt();
        }

        printDiamondPattern(t, testCases);
    }
}
