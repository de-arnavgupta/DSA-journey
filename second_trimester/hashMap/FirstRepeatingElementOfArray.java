package DSA.second_trimester.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElementOfArray
{
    public static int firstRepeatingElementUsingSet(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (set.contains(arr[i]))
            {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }

    public static int firstRepeatingElementUsingMap(int[] arr)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if (freq.get(arr[i]) > 1)
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 5, 1};
        int result = firstRepeatingElementUsingMap(arr);
        System.out.println("First repeating element using map: " + result);
    }
}
