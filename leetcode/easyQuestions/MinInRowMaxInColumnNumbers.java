package DSA.leetcode.easyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinInRowMaxInColumnNumbers
{
    public static void main(String[] args)
    {
        int[][] matrix = {{3, 3, 1, 1},
                          {2, 2, 1, 2},
                          {1, 1, 1, 2}};
        System.out.println(luckyNumbers(matrix));
    }

    public static int[] luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMins = new int[m];
        int[] colMaxes = new int[n];

        Arrays.fill(rowMins, Integer.MAX_VALUE);
        Arrays.fill(colMaxes, Integer.MIN_VALUE);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMins[i] = Math.min(rowMins[i], matrix[i][j]);
                colMaxes[j] = Math.max(colMaxes[j], matrix[i][j]);
            }
        }

        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxes[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        int[] result = new int[luckyNumbers.size()];
        for (int i = 0; i < luckyNumbers.size(); i++) {
            result[i] = luckyNumbers.get(i);
        }

        return result;
    }
}
