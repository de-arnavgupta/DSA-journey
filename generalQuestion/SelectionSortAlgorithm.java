package DSA.generalQuestion;

import java.util.Scanner;

public class SelectionSortAlgorithm {
    public static void sortArray(int[] arr, int size) {
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                int min = arr[i];
                if(arr[j] < min){
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr, size);

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
