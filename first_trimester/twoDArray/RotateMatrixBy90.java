package DSA.first_trimester.twoDArray;

import static DSA.first_trimester.twoDArray.TransposeOfMatrix.*;

public class RotateMatrixBy90 {
    public static void interchangeColumns(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][column - 1 - j];
                arr[i][column - 1 - j] = temp;
            }
        }
    }
    public static void rotateMatrixBy90(int[][] arr) {
        transpose(arr);
        interchangeColumns(arr);
    }

    public static void main(String[] args) {
        int[][] arr = input2dArray();
        rotateMatrixBy90(arr);
        print2dArray(arr);
    }
}
