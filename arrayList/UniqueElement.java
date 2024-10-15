package DSA.arrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UniqueElement {
    public static ArrayList<Integer> uniqueElement(ArrayList<Integer> arr) {
        ArrayList<Integer> uniqueElement = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            int count = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(Objects.equals(arr.get(i), arr.get(j))) {
                    count++;
                }
            }
            if(count == 1) {
                uniqueElement.add(arr.get(i));
            }
        }
        return uniqueElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < numberOfElements; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(uniqueElement(arr));
    }
}
