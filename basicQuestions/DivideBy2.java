package DSA.basicQuestions;

import java.util.Scanner;

public class DivideBy2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = num; i >= 2; i /= 2) {
            count++;
        }
        System.out.println(count);
    }
}
