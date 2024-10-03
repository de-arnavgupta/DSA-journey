package DSA.generalQuestion;

import java.util.Scanner;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int times = size - max;
        for(int j = 1; j <= times; j++){
            int temp = arr[size - 1];
            int i = arr.length - 2;
            while(arr[i] > temp){
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
