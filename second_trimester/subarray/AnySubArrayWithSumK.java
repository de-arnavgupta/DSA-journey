package DSA.second_trimester.subarray;

import java.util.HashMap;

public class AnySubArrayWithSumK
{
    public static void main(String[] args) {
        int[] arr = {9,4,20,3,10,5};
        int k = 33;
        System.out.println(anySubArrayWithSumK(arr, k));
    }

    public static boolean anySubArrayWithSumK(int[] arr, int k)
    {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < prefix.length; i++)
        {
            if(map.containsKey(prefix[i] - k))
            {
                if(map.get(prefix[i] - k) != i)
                {
                    return true;
                }
            }
            map.put(prefix[i], i);
        }
        return false;
    }
}
