package DSA.second_trimester;

import java.util.HashMap;

public class FirstNonRepeatingElement
{
    public static void main(String[] args)
    {
        int[] arr = {3,1,2,1,5,6,2,3};
        System.out.println(firstNonRepeatingElement(arr));
    }

    public static int firstNonRepeatingElement(int[] arr)
    {
        HashMap<Integer, Integer[]> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.get(arr[i])[0] += 1;
            }
            else
            {
                map.put(arr[i], new Integer[]{1, i});
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (map.get(arr[i])[0] == 1)
            {
                if(ans >= map.get(arr[i])[1])
                {
                    ans = map.get(arr[i])[1];
                }
            }
        }
        return ans;
    }
}
