package DSA.generalQuestion;

import java.util.Scanner;

public class BubbleSorting {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            boolean check = true;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = false;
                }
            }
            if(check){
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        printArray(arr);
    }
}
