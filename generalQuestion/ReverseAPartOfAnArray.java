package DSA.generalQuestion;

import java.util.Scanner;

public class ReverseAPartOfAnArray {
    public static void inputArray(Scanner sc, int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void reverse(int[] arr, int start, int end){
        for(int i = start; i < end; i++, end--){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
    }
    public static void printReversedArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        inputArray(sc, size);

        int start = sc.nextInt();
        int end = sc.nextInt();

        reverse(arr, start, end);
        printReversedArr(arr);
    }
}