package DSA.loops.easyQuestions;

import java.util.Scanner;

public class SumofThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        int count = 0;

        for (int X = 0; X <= K; X++) {
            for (int Y = 0; Y <= K; Y++) {
                int Z = S - X - Y;

                if (Z >= 0 && Z <= K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

