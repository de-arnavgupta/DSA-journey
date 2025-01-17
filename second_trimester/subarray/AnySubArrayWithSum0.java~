package DSA.second_trimester;

import java.util.HashMap;

public class AnySubArrayWithSum0
{
    public static void main(String[] args)
    {
        int[] arr = {-5,7,4,5,-2,1,-3,-2,1,8};
        System.out.println(anySubArrayWithSumZero(arr));
    }

    public static boolean anySubArrayWithSumZero(int[] arr)
    {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < prefixSum.length; i++)
        {
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);
            if(map.getOrDefault(prefixSum[i], 0) > 1)
            {
                return true;
            }
        }
        return false;
    }
}
