package DSA.second_trimester.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementsOfAnArray
{
    public static HashMap<Integer, Integer> frequencyUsingMap(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,42,4,2,1,4,7,5,6,5,4,5,6,3,2,3,4,5,6,8,21,9};
        HashMap<Integer, Integer> map = frequencyUsingMap(arr);

        Scanner sc = new Scanner(System.in);
        int numberOfQueries = sc.nextInt();
        for(int i = 0; i < numberOfQueries; i++)
        {
            int query = sc.nextInt();
            System.out.println(map.getOrDefault(query, 0));
        }
    }
}
