package DSA.second_trimester.binarySearch;

public class FloorValueOfTarget
{
    public static int floor(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
            {
                return arr[mid];
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        if(high == -1)
        {
            return Integer.MIN_VALUE;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        int[] arr = {-5, 2, 3,6, 9, 10, 11, 15, 18};
        int target = 7;
        int floorValue = floor(arr, target);
        System.out.println(floorValue);
    }
}
