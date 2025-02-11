package DSA.second_trimester;

import java.util.HashMap;

public class NumberOfDistinctPairHavingAbsoluteDifferenceIsB {
    public static void main(String[] args) {
        System.out.println(numberOfDistinctPairHavingAbsoluteDifferenceIsB(new int[]{1,1,1,2,2}, 0));
    }

    public static int numberOfDistinctPairHavingAbsoluteDifferenceIsB(int[] arr, int b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        if(b == 0) {
            for(int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if(map.get(arr[i]) == 2) {
                    count++;
                }
            }
            return count;
        }
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i] + b)) {
                count++;
            }
            else if(map.containsKey(arr[i] - b)) {
                count++;
            }
            map.remove(arr[i]);
        }
        return count;
    }
}

