package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class DistinctSumOfThreeProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long n = sc.nextLong();

            if (n <= 6) {
                System.out.println("NO");
            }
            else if ((n - 3) % 3 != 0) {
                System.out.println("YES");
                System.out.println("1 2 " + (n - 3));
            }else if(n ==9){
                System.out.println("NO");;
            }
            else if ((n - 5) % 3 != 0) {
                System.out.println("YES");
                System.out.println("1 4 " + (n - 5));
            }
            t--;
        }
    }
}
