package DSA.second_trimester.hashMap;

import java.util.HashMap;

public class MinDifferenceBetweenIndexOfTwoDuplicateNumber {

    public static int minDiffUsingMap(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], i);
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(map.get(arr[i]) != i)
            {
                minDiff = Math.min(minDiff, i - map.get(arr[i]));
            }
            map.put(arr[i], i);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 6, 5, 2, 3};
        System.out.println(minDiffUsingMap(arr, arr.length));
    }
}
