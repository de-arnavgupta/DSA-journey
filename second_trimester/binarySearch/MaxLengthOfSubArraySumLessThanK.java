package DSA.second_trimester.binarySearch;

public class MaxLengthOfSubArraySumLessThanK
{
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 5, 4, 6, 3, 7, 2};
        int k = 20;
        System.out.println(maxLength(arr, k));
    }
    public static int maxLength(int[] arr, int target) {

        int start = 0;
        int end = arr.length;
        int length = 0;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            int check = sumOfLengthK(arr, mid);

            if (check < target)
            {
                length = mid;
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return length;
    }

    public static int sumOfLengthK(int[] arr, int k)
    {
        int sum = 0;

        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }

        int max = sum;
        for(int i = k; i < arr.length; i++)
        {
            sum = sum - arr[i - k] + arr[i];
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}
