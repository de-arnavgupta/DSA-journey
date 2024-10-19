package DSA.leetcode;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int[] temp = new int[m + n];
        for (int k = 0; k < m + n; k++) {
            if (i == m) {
                temp[k] = nums2[j];
                j++;
            } else if (j == n) {
                temp[k] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
        }
        if ((m + n) % 2 == 0) {
            ans = (double) (temp[(m + n) / 2] + temp[(m + n) / 2 - 1]) / 2;
        }
        else {
            ans = temp[(m + n) / 2];
            return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
