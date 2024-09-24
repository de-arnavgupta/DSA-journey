package DSA.basicQuestions.pattern;

import java.util.Scanner;

public class AlphabetPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        char alph = 'A';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                System.out.print(alph);
            }
            alph++;
            System.out.println();
        }
    }
}
