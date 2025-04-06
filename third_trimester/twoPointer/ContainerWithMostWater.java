package DSA.third_trimester.twoPointer;

import java.util.Scanner;

import static DSA.leetcode.mediumQuestions.ContainerWithMostWater.maxArea;


public class ContainerWithMostWater
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}
