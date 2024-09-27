package DSA.generalQuestion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);

        int sum = 0;

        for(int n = num; n > 0; n /= 10){
            sum += n % 10;
        }
        System.out.println(sum);
    }
}
