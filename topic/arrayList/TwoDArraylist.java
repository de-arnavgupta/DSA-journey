package DSA.topic.arrayList;

import java.util.ArrayList;

public class TwoDArraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < 3; j++) {
                temp.add(0);
            }
            arr.add(temp);
        }
        System.out.println(arr);
    }
}
