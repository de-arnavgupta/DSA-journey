package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

import static DSA.first_trimester.generalQuestion.ReverseAPartOfAnArray.*;

public class ShiftElementInArray {
    public static void shiftElement(int[] arr, int size, int times){
       reverse(arr, 0, size - 1);
       reverse(arr,(size - times), size - 1);
       reverse(arr, 0, (size - times) - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        inputArray(sc, size, arr);

        int times = sc.nextInt();

        shiftElement(arr, size, times);
        printArr(arr);
    }
}
