package DSA.dhruvBhaiya.recursion;

public class PrintAllTheSubarrayWithSumTarget
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] ans = printAllTheSubarrayWithSumTarget(arr, 0, 0, 5);
    }

    public static int[][] printAllTheSubarrayWithSumTarget(int[] arr, int index, int sum, int target)
    {
        if(index == arr.length) {
            if(sum == target) {
                return new int[1][0];
            }
        }
        int[][] ans1 = printAllTheSubarrayWithSumTarget(arr, index + 1, sum + arr[index], target);
        int[][] ans2 = printAllTheSubarrayWithSumTarget(arr, index + 1, sum, target - arr[index]);

        int[][] ans = new int[ans1.length + ans2.length][];
        int k = 0;
        for(int i = 0; i < ans1.length; i++) {
            ans[k++] = ans1[i];
        }
        for(int i = 0; i < ans2.length; i++) {
            ans[k++] = ans2[i];
        }
        return ans;
    }
}
