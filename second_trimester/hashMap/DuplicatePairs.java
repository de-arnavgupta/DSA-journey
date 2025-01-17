package DSA.second_trimester.hashMap;

import java.util.HashMap;

public class DuplicatePairs
{
    public static int duplicatePairsUsingMap(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int frequency : map.values())
        {
            if (frequency > 1)
            {
                count += (frequency * (frequency - 1)) / 2;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,5,2,3,6,5,5,2,3};
        System.out.println(duplicatePairsUsingMap(arr));
    }
}
