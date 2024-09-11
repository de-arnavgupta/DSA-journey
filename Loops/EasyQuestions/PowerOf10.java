package codeforces.Loops.EasyQuestions;

import java.util.Scanner;

public class PowerOf10
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            digits(num);

        }
    }

    public static void digits(int num) {
        int count = 0;
        int n = num;
        while(num > 0) {
            num /= 10;
            count++;
        }
        System.out.println((int)(n - Math.pow(10, count-1)));
    }
}
