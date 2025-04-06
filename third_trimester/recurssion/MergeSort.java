package DSA.third_trimester.recurssion;

import java.util.Scanner;

public class MergeSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        int[] arr1 = new int[length1];

        for (int i = 0; i < length1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int length2 = sc.nextInt();
        int[] arr2 = new int[length2];

        for (int i = 0; i < length2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] ans = mergeSortUsingIteration(arr1, arr2);

        for (int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }

        int[] ans2 = new int[length2 + length1];
        mergeSortUsingRecursion(arr1, arr2, ans2, 0, 0, 0);

        for (int i = 0; i < ans2.length; i++)
        {
            System.out.print(ans2[i] + " ");
        }
    }

    private static void mergeSortUsingRecursion(int[] arr1, int[] arr2, int[] ans2, int i, int j, int k)
    {
        if (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                ans2[k] = arr1[i];
                i++;
            }
            else
            {
                ans2[k] = arr2[j];
                j++;
            }
            k++;
            mergeSortUsingRecursion(arr1, arr2, ans2, i, j, k);
        }

        while (i < arr1.length)
        {
            ans2[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            ans2[k] = arr2[j];
            j++;
            k++;
        }
    }


    public static int[] mergeSortUsingIteration(int[] arr1, int[] arr2)
    {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                ans[k] = arr1[i];
                i++;
            }
            else
            {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length)
        {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}