package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

public class FactorialAndTrailingZeros {
    public static void factorial(long num){
        long result = 1;
        for(long i = num; i > 0; i--){
            result *= i;
        }
        System.out.println(result);
    }

    public static void trailingZeroes(long num){
        long result = 0;
        for(long i = 5; i <= num; i *= 5){
            result += num/i;
        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        factorial(num);
        trailingZeroes(num);
    }
}
