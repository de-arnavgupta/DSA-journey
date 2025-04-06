package DSA.third_trimester.twoPointer;

import java.util.Scanner;

public class PairWithDifferenceK
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairWithDifferenceK(arr, k));
    }

    public static int pairWithDifferenceK(int[] arr, int k)
    {
        int i = 0;
        int j = 0;
//        int count = 0;
        while(j < arr.length)
        {
            if(arr[j] - arr[i] == k)
            {
                if(i != j)
                {
                    return 1;
                }
                j++;
            }
            else if(arr[j] - arr[i] < k)
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return 0;
    }
}
