package DSA.leetcode.easyQuestions;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        System.out.println(num);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}