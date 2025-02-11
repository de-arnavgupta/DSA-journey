package DSA.dhruvBhaiya.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = permutationOfArray(arr, 0);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> permutationOfArray(int[] arr, int startIndex) {

        if(startIndex == arr.length)
        {
            return new ArrayList<ArrayList<Integer>>();
        }

        ArrayList<ArrayList<Integer>> smallAns = permutationOfArray(arr, startIndex + 1);

        ArrayList<ArrayList<Integer>> myAns = new ArrayList<>();
        for(int i = 0; i < smallAns.size(); i++)
        {
            for(int j = 0; j <= smallAns.get(i).size(); j++)
            {
                ArrayList<Integer> temp = new ArrayList<>(smallAns.get(i));
                temp.add(j, arr[startIndex]);
                myAns.add(temp);
            }
        }
        return myAns;
    }
}
