package DSA.twoDArray;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void transpose(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for(int i = 0 ; i < row; i++) {
            for(int j = i+1; j < column; j++) {
                if(i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void print2dArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr = new int[row][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr);
        print2dArray(arr);
    }
}
