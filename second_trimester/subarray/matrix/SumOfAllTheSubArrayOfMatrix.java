package DSA.second_trimester.subarray.matrix;

import static DSA.first_trimester.twoDArray.TransposeOfMatrix.input2dArray;

public class SumOfAllTheSubArrayOfMatrix
{
    public static void main(String[] args) {
        int[][] arr = input2dArray();
        int row = arr.length;
        int column = arr[0].length;
        int[][] prefixMatrix = new int[row][column];
    }
}
