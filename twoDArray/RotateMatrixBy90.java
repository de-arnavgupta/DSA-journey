package DSA.twoDArray;

import java.util.Scanner;

import static DSA.twoDArray.TransposeOfMatrix.print2dArray;
import static DSA.twoDArray.TransposeOfMatrix.transpose;

public class RotateMatrixBy90 {
    public static void rotateMatrixBy90(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;

        transpose(arr);

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][column - 1 - j];
                arr[i][column - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr = new int[row][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateMatrixBy90(arr);
        print2dArray(arr);
    }
}
