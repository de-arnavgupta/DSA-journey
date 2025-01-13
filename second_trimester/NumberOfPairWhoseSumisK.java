package DSA.second_trimester;

import java.util.HashMap;

import static DSA.second_trimester.FrequencyOfElementsOfAnArray.frequencyUsingMap;

public class NumberOfPairWhoseSumisK
{
    public static int numberOfPairWhoseSumisKUsingMap(int[] arr, int k)
    {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            int complement = k - arr[i];
            if(map.containsKey(complement))
            {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int target = 10;
        int[] arr = {4,4,6,6,6};

        System.out.println(numberOfPairWhoseSumisKUsingMap(arr, target));
    }
}
