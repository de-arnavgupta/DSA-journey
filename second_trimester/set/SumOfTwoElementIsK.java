package DSA.second_trimester.set;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoElementIsK
{
    public static void main(String[] args)
    {
        int[] arr = {4,4,6,6,6};
        int k = 10;

        Set<Integer> set = new HashSet<>();

        for(int i : arr)
        {
            int complement = k - i;
            if(set.contains(complement))
            {
                System.out.println("Pair found: (" + i + ", " + complement + ")");
            }
            set.add(i);
        }
    }
}