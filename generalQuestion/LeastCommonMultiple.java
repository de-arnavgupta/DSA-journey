package DSA.generalQuestion;

import java.util.Scanner;

public class LeastCommonMultiple {

        public static int gcd(int num1, int num2)
        {
            int hcf = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
            }
            return hcf;
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
