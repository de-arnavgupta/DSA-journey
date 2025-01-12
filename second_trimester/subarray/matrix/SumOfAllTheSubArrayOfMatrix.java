package DSA.second_trimester.subarray.matrix;

import static DSA.first_trimester.twoDArray.TransposeOfMatrix.input2dArray;

public class SumOfAllTheSubArrayOfMatrix
{
    public static void main(String[] args) {
        int[][] arr = input2dArray();
        int row = arr.length;
        int column = arr[0].length;
        int[][] prefixMatrix = new int[row][column];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(j == 0){
                    prefixMatrix[i][j] = arr[i][j];
                }
                else{
                    prefixMatrix[i][j] = prefixMatrix[i][j - 1] + arr[i][j];
                }
            }
        }
    }
}
