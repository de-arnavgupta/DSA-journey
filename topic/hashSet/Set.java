package DSA.topic.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Set
{
    public static void main(String[] args) {
        int[] arr = {1,3,2,42,4,24,13,1,3,34,3};
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        System.out.println(set.size());
    }
}
