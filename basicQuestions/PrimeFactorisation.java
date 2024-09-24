package DSA.basicQuestions;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num % 2 == 0){
            System.out.println(2);
            num = num / 2;
        }

        int temp = num;

        for (int i = 3; i*i <= num; i = i + 2) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
        if(num > 2) {
            System.out.println(num);
        }
    }
}
