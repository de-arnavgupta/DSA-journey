package DSA.basicQuestions;

import java.util.Scanner;

public class Lcm {

        public static int gcd(int num1, int num2)
        {

            if (num2 == 0)
            {
                return num1;
            }
            return gcd(num2, num1%num2);
        }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println(lcm);
    }
}
