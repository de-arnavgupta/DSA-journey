package DSA.basicQuestions;

import java.util.Scanner;

public class AdditionInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] + arr[j] == num) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
