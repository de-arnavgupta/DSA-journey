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
        for(int i = 0; i < arr.length; i++)
        {
           for(int j = 0; j < arr[i].length; j++)
           {
               if(j == 0){
                   prefix[i][j] = arr[i][j];
               }
               else{
                   prefix[i][j] = prefix[i][j - 1] + arr[i][j];
               }

           }
        }
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                prefix[i][j] = prefix[i][j] + prefix[i - 1][j];
            }
        }
        print2dArray(prefix);
    }
}
