package DSA.second_trimester.binarySearch;

public class FrequencyOfTarget
{
    public static int frequency(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                int left = mid - 1;
                int right = mid + 1;
                int count = 1;
                while (left >= 0 && arr[left] == target) {
                    count++;
                    left--;
                }
                while (right < arr.length && arr[right] == target) {
                    count++;
                    right++;
                }
                return count;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,6,7,8,4,53,3};
        int target = 0;
        System.out.println(frequency(arr, target));
    }
}
