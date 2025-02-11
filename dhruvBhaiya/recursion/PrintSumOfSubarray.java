package DSA.dhruvBhaiya.recursion;

public class PrintSumOfSubarray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSumOfSubarray(arr);
    }

    public static void printSumOfSubarray(int[] arr) {
        printSumOfSubarray(arr, 0, 0);
    }

    public static void printSumOfSubarray(int[] arr, int index, int sum) {
        if (index == arr.length) {
            System.out.println(sum);
            return;
        }
        printSumOfSubarray(arr, index + 1, sum + arr[index]);
        printSumOfSubarray(arr, index + 1, sum);
    }
}