package DSA.second_trimester;

import java.util.Scanner;

public class SumOfElementsInGivenRange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] prefixSum = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSum[0] = arr[0];
        for(int i = 1; i < size; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int queries = sc.nextInt();

        for(int i = 0; i < queries; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(sum(arr, start, end, prefixSum));
        }
    }

    public static int sum(int[] arr, int start, int end, int[] prefixSum) {
        int sum;
        if(start == 0) {
            sum = prefixSum[end];
        }
        else {
            sum = prefixSum[end] - prefixSum[start - 1];
        }
        return sum;
    }
}
