package DSA.second_trimester.subarray;

import java.util.HashMap;

public class AnySubArrayWithSumK
{
    public static void main(String[] args) {
        int[] arr = {3,5,2,2,1,4,7,6,5,43,4,6};
        int k = 9;
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
