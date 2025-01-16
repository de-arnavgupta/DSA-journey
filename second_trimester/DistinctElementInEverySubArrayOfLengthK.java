package DSA.second_trimester;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementInEverySubArrayOfLengthK
{
    public static void main(String[] args) {
        int[] arr = {3,2,1,3,5,6,2,5,5,7};
        int k = 4;
        int[] result = distinctElementInEverySubArrayOfLengthK(arr, k);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] distinctElementInEverySubArrayOfLengthK(int[] arr, int k)
    {
        int[] result = new int[arr.length - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result[0] = map.size();

        for(int i = k; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if(map.get(arr[i - k]) == 0)
            {
                map.remove(arr[i - k]);
            }
            result[i - k + 1] = map.size();
        }
        return result;
    }
}
