package DSA.second_trimester.subarray;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementInARange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input:
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        int differenceArray[] = new int[length];

        // Run queries
        while (queries-- > 0) {

            // Get l, r, val
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();

            // Mark the difference
            differenceArray[end] += value;
            if (start != 0) differenceArray[start - 1] += -value;
        }

        // Prefix sum of the diff array to get the net contribution from end to start
        for (int i = length - 2; i >= 0; i--) {
            differenceArray[i] += differenceArray[i + 1];
        }

        // Add to original arr
        for (int i = 0; i < length; i++) {
            arr[i] += differenceArray[i];
        }

        // Print elems
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
