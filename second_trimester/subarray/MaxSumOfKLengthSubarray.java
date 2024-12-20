package DSA.second_trimester.subarray;

import java.util.Scanner;

public class MaxSumOfKLengthSubarray
{
    public static void main(String[] args)
    {
        Scanner sc =   new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }

        int max = sum;
        for(int i = k; i < length; i++)
        {
            sum = sum - arr[i - k] + arr[i];
            if(sum > max)
            {
                max = sum;
            }
        }
    }
}
