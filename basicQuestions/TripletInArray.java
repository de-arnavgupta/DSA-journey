package DSA.basicQuestions;

import java.util.Scanner;

public class TripletInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                for(int k = j+1; k < size; k++) {
                    if((arr[i] + arr[j] + arr[k])% 2 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
