package DSA.leetcode.mediumQuestions;

import java.util.Scanner;

public class MinMovesToMakeArrayEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minMoves(arr));
    }

    public static int minMoves(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int moves = 0;
        for (int i = 0; i < arr.length; i++) {
            moves += arr[i] - min;
        }
        return moves;
    }
}
