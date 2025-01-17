package DSA.second_trimester;

public class BalancedIndexCount {
    public static int countBalancedIndices(int[] A) {
        int N = A.length;

        if (N == 1) return 1;

        int[] prefixEven = new int[N];
        int[] prefixOdd = new int[N];
        prefixEven[0] = A[0];
        prefixOdd[0] = 0;

        for (int i = 1; i < N; i++) {
            prefixEven[i] = prefixEven[i - 1] + (i % 2 == 0 ? A[i] : 0);
            prefixOdd[i] = prefixOdd[i - 1] + (i % 2 != 0 ? A[i] : 0);
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            int evenSum = (i > 0 ? prefixEven[i - 1] : 0) +
                    (i < N - 1 ? prefixOdd[N - 1] - prefixOdd[i] : 0);
            int oddSum = (i > 0 ? prefixOdd[i - 1] : 0) +
                    (i < N - 1 ? prefixEven[N - 1] - prefixEven[i] : 0);

            if (evenSum == oddSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 6, 4};
        System.out.println(countBalancedIndices(A));
    }
}
