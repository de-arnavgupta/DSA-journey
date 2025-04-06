package DSA.third_trimester.twoPointer;

import java.util.Scanner;

public class PairWithSumK
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array it is sorted
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(pairWithSumKInAnSortedArray(arr, k));
    }
    public static int pairWithSumKInAnSortedArray(int[] arr, int k)
    {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while(i < j)
        {
            if(arr[i] + arr[j] == k)
            {
                count++;
            }
            else if(arr[i] + arr[j] < k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return count;
    }


}
