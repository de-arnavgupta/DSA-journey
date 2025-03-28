package DSA.trimester3.stack;

import java.util.Stack;

public class NearestSmallNumberInTheLeft
{
    public static void main(String[] args)
    {
        int[] arr = {4,6,10,11,7,8,3,5};
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1; //expected output - [-1, -1, 2, 5, 5, -1]

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < n; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = arr[stack.peek()];
            }
            stack.push(i);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(res[i] + " ");
        }

    }
}
//expected output - [-1, -1, 2, 5, 5, -1]
