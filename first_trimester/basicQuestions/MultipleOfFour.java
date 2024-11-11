package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class MultipleOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 4; i <= n; i += 4) {
            System.out.println(i);

        }

    }
}
