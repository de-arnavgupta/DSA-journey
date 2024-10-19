package DSA.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSpiralArrayList {

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < A; j++) {
                matrix.get(i).add(0);
            }
        }

        int top = 0, bottom = A - 1;
        int left = 0, right = A - 1;
        int value = 1;


        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix.get(top).set(i, value++);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix.get(i).set(right, value++);
            }
            right--;


            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix.get(bottom).set(i, value++);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix.get(i).set(left, value++);
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(generateMatrix(A));
    }
}
