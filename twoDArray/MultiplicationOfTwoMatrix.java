package DSA.twoDArray;

import java.util.Scanner;

import static DSA.twoDArray.TransposeOfMatrix.print2dArray;

public class MultiplicationOfTwoMatrix {
    public static void multiply(int[][] arr1, int[][] arr2, int[][] arr3) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                for(int k = 0; k < arr1[0].length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[column][row];
        int[][] arr3 = new int[row][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        multiply(arr1, arr2, arr3);
        print2dArray(arr3);
    }
}
