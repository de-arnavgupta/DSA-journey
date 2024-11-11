package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

public class UniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            boolean unique = true;
            for(int j = 0; j < size; j++) {
                if(i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if(unique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
