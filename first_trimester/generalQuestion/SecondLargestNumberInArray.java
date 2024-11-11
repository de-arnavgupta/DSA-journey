package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if(size < 2) {
            System.out.println("NA");
        }
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        if(max == secondMax){
            System.out.println("NA");
        }
        else{
            System.out.println(secondMax);
        }
    }
}
