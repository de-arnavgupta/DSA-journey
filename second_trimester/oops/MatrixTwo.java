package DSA.second_trimester.oops;

import java.util.Scanner;

public class MatrixTwo {
    int row;
    int column;
    int[][] arr;

    public MatrixTwo(int row, int column) {
        this.row = row;
        this.column = column;
        this.arr = new int[row][column];
    }

    public void input(Scanner sc) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.row, other.column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < other.column; j++) {
                for (int k = 0; k < other.row; k++) {
                    result.arr[i][j] += arr[i][k] * other.arr[k][j];
                }
            }
        }
        return result;
    }

    public int diagonalDifference() {
       int sum1 = 0;
       int sum2 = 0;

       for(int i = 0; i < row; i++){
           for(int j = 0; j < column; j++){
               if(i == j){
                   sum1 += arr[i][j];
               }
               if(i + j == column - 1){
                   sum2 += arr[i][j];
               }
           }
       }
       return Math.abs(sum1 - sum2);

    }

    public void print() {
        // Print the matrix column by column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}