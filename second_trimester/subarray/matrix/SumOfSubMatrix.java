package DSA.second_trimester.subarray.matrix;

import java.util.Scanner;

public class SumOfSubMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int queries = sc.nextInt();
        int[][] queriesArray = new int[queries][4];

        while (queries-- > 0) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            queriesArray[queries][0] = r1;
            queriesArray[queries][1] = c1;
            queriesArray[queries][2] = r2;
            queriesArray[queries][3] = c2;
        }
    }
}
