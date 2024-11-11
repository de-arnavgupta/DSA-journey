package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class Palindrome
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        num = Math.abs(num);
        int rev = 0;

        for (int n = num; n > 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }
        if(rev == num)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not a Palindrome");
        }
    }
}
