package DSA.second_trimester.set;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoElementIsK
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,34,2,3,2,3,1,44,6,7,58,6,8,5,67,56,4,64};
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