package DSA.codeforce.loops.div3;

import java.util.Arrays;
import java.util.Scanner;

public class Twice {
    public static int Frequency(int[] arr) {

        Arrays.sort(arr);
        int score = 0;
        for (int i = 0; i < arr.length;) {
            int count = 0;
            int current_element = arr[i];

            for (int j = i; j < arr.length && arr[j] == current_element; j++) {
                count++;
                i++;
            }
            score += count / 2;
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int j = 0; j < t; j++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(Frequency(arr));
        }
    }
}