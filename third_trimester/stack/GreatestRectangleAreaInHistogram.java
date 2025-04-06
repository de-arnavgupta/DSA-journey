package DSA.third_trimester.stack;

import java.util.Stack;

public class GreatestRectangleAreaInHistogram
{
    public static void main(String[] args) {
        int[] arr = {4,3,4,6,2};
        int n = arr.length;

        int[] left = NearestSmallNumberInLeft(arr);
        int[] right = NearestSmallNumberInRight(arr);
        int[] area = new int[n];
        for(int i = 0; i < n; i++)
        {
            area[i] = (right[i] - left[i] - 1) * arr[i];
        }
        int max = area[0];
        for(int i = 1; i < n; i++)
        {
            max = Math.max(max, area[i]);
        }
        System.out.println(max);
    }

    public static int[] NearestSmallNumberInLeft(int[] arr)
    {
        int n = arr.length;
        int[] left = new int[n];
        Stack stack = new Stack();
        for(int i = 0; i < n; i++)
        {
            while(!stack.isEmpty() && arr[(int) stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : (int) stack.peek();
            stack.push(i);
        }
        return left;
    }

    public static int[] NearestSmallNumberInRight(int[] arr)
    {
        int n = arr.length;
        int[] right = new int[n];
        Stack stack = new Stack();
        for(int i = n - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && arr[(int) stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : (int) stack.peek();
            stack.push(i);
        }
        return right;
    }
}
