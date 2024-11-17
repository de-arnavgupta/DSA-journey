package DSA.codeforce.loops.div3;

import java.util.Arrays;
import java.util.Scanner;

public class InterceptedInput {

    public static void findDimensions(int[] arr, int totalInput) {
        int maxProduct = -1;
        int sol[] = new int[2];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = totalInput - 2;
            int left = i + 1, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int product = arr[i] * arr[mid];

                if (product > maxProduct && product <= target) {
                    maxProduct = product;
                    sol[0] = arr[i];
                    sol[1] = arr[mid];
                    left = mid + 1;
                } else if (product > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        if (sol[0] == 0 && sol[1] == 0) {
            System.out.println("1 " + arr.length);
        } else {
            System.out.println(sol[0] + " " + sol[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int totalInput = sc.nextInt();
            int[] arr = new int[totalInput];
            for (int j = 0; j < totalInput; j++) {
                arr[j] = sc.nextInt();
            }
            findDimensions(arr, totalInput);
        }
    }
}
