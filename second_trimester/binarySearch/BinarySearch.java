package DSA.second_trimester.binarySearch;

public class BinarySearch
{
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
            {
                return mid;
            } else if (arr[mid] < target)
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int index = binarySearch(arr, target);
        if (index != -1)
        {
            System.out.println("Element " + target + " found at index " + index);
        } else
        {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
