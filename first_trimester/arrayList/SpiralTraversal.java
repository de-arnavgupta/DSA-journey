package DSA.first_trimester.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralTraversal {
    public static ArrayList<Integer> spiralTraversal(ArrayList<ArrayList<Integer>> arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = arr.size() - 1;
        int left = 0;
        int right = arr.get(0).size() - 1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans.add(arr.get(top).get(i));
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr.get(i).get(right));
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr.get(bottom).get(i));
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr.get(i).get(left));
                }
            }
            left++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }
        System.out.println(spiralTraversal(arr));
    }
}
