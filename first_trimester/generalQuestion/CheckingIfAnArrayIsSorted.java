package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

import static DSA.first_trimester.generalQuestion.ReverseAPartOfAnArray.inputArray;

public class CheckingIfAnArrayIsSorted {
    public static boolean checkIfSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(sc, size, arr);
        System.out.println(checkIfSorted(arr));
    }
}
