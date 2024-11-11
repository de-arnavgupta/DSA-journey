package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

public class SortingLastElement {
    public static int[] sortArray(int[] arr, int max, int last) {
        if (max == last) {
            return arr;
        }
        else {
            int temp = last;
            int i = arr.length - 2;
            while(arr[i] > temp){
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
            return arr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[size - 2];
        int last = arr[size - 1];

        sortArray(arr, max, last);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
