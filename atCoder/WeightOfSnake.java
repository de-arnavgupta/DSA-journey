package DSA.atCoder;

import java.util.Scanner;

public class WeightOfSnake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] T = new int[N];
        int[] L = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            L[i] = sc.nextInt();
        }


        for (int k = 1; k <= D; k++) {
            int maxWeight = Integer.MIN_VALUE;


            for (int i = 0; i < N; i++) {
                int currentWeight = T[i] * (L[i] + k);
                if (currentWeight > maxWeight) {
                    maxWeight = currentWeight;
                }
            }
            System.out.println(maxWeight);
        }
    }
}
