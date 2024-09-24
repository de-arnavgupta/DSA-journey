package DSA.basicQuestions;

import java.util.Scanner;

public class ReverseNumber
{

    public static int reverseNumber(int num)
    {
        int rev = 0;
        for (int n = num; n > 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }
        return rev;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int abs = Math.abs(num);

        if(num > 0)
        {
            int n = reverseNumber(abs);
            System.out.println(n);
        }
        else
        {
            int n = reverseNumber(abs);
            System.out.println(n*-1);
        }
    }
}
