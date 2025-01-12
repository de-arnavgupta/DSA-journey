package DSA.second_trimester.subarray.matrix;

import java.util.Scanner;

import static DSA.first_trimester.twoDArray.TransposeOfMatrix.input2dArray;
import static DSA.first_trimester.twoDArray.TransposeOfMatrix.print2dArray;

public class SumOfSubMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = input2dArray();
        int[][] prefix = new int[arr.length][arr[0].length];

        prefix[0][0] = arr[0][0];

        for(int i = 1; i < arr.length; i++)
        {
            prefix[i][0] = prefix[i - 1][0] + arr[i][0];
        }

        for(int i = 1; i < arr[0].length; i++)
        {
            prefix[0][i] = prefix[0][i - 1] + arr[0][i];
        }

        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 1; j < arr[0].length; j++)
            {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + arr[i][j];
            }
        }
        print2dArray(prefix);
    }
}
