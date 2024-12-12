package DSA.second_trimester;

import java.util.Scanner;

public class NumberOfEvenNumberInArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        int[] countEven = new int[size];
        int count = 0;

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                count++;
            }
            countEven[i] = count;
        }

        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (start == 0) {
                System.out.println(countEven[end]);
            } else {
                System.out.println(countEven[end] - countEven[start - 1]);

            }
        }
    }
}
