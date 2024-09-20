package DSA.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class RangeMinimize {
    public static int minRangeAfterDeletions(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return 0;
        }

        Arrays.sort(arr);

        int minRange = arr[n - 1] - arr[0];

        minRange = Math.min(minRange, arr[n - 1] - arr[1]);
        minRange = Math.min(minRange, arr[n - 2] - arr[0]);

        minRange = Math.min(minRange, arr[n - 2] - arr[1]);
        minRange = Math.min(minRange, arr[n - 3] - arr[0]);
        minRange = Math.min(minRange, arr[n - 1] - arr[2]);

        return minRange;
    }

    public static void solveTestCase(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minRangeAfterDeletions(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solveTestCase(sc);
        }
    }
}
