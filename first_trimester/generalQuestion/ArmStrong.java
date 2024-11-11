package DSA.first_trimester.generalQuestion;

import java.util.Scanner;

public class ArmStrong {

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while(num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
