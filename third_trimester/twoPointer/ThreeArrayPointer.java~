package DSA.trimester3.twoPointer;

import java.util.Scanner;

public class ThreeArrayPointer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            arr3[i] = sc.nextInt();
        }
        System.out.println(minimumDifferenceOfMaxAndMind(arr1, arr2, arr3, n));
    }

    public static int minimumDifferenceOfMaxAndMind(int[] arr1, int[] arr2, int[] arr3, int n)
    {
        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;
        while(i < n && j < n && k < n)
        {
            int min = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
            int max = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
            minDiff = Math.min(minDiff, max - min);
            if(arr1[i] == min)
            {
                i++;
            }
            else if(arr2[j] == min)
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        return minDiff;
    }
}
