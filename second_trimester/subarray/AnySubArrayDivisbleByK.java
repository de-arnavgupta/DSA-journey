package DSA.second_trimester.subarray;

import java.util.HashMap;

public class AnySubArrayDivisbleByK
{
    public static void main(String[] args) {
        int[] arr = {3,2,4,4,3,6,3,1,3,5};
        int k = 3;
        System.out.println(anySubArrayDivisibleByK(arr, k));
    }

    public static boolean anySubArrayDivisibleByK(int[] arr, int k)
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
            map.put(prefix[i]%k, map.getOrDefault(prefix[i]%k, 0) + 1);
            if(map.get(prefix[i]%k) > 1)
            {
                return true;
            }

        }
        return false;
    }
}
