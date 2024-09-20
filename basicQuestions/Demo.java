package DSA.basicQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();

       for(int i = 0; i < test; i++) {
           int size = sc.nextInt();
           int[] arr = new int[size];

           for(int j = 0; j < size; j++) {
               arr[j] = sc.nextInt();
           }
           Arrays.sort(arr);
           for(int j = 0; j < size; j++) {
               boolean unique = true;
               for(int k = 0; k < size; k++) {
                   if(j != k && arr[j] == arr[k]) {
                       unique = false;
                       break;
                   }
               }
               if(unique) {
                   System.out.print(arr[j] + " ");
               }
           }
           System.out.println();
       }
    }
}