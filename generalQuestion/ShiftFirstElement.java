package DSA.generalQuestion;

import java.util.Scanner;

import static DSA.generalQuestion.ReverseAPartOfAnArray.inputArray;
import static DSA.generalQuestion.ReverseAPartOfAnArray.printArr;

public class ShiftFirstElement {
    public static void shiftElement(int[] arr, int size){
        int temp = arr[0];
        for(int i = 1; i < size; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[size-1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(sc, size, arr);
        shiftElement(arr, size);
        printArr(arr);
    }
}
