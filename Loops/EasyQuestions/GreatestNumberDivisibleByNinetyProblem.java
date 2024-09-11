package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class GreatestNumberDivisibleByNinetyProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int num = 0;
        int count0 = 0;
        int count5 = 0;

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();

            if(n == 0){
                count0++;
            }

            if(n == 5){
                count5++;
            }
        }
        if (count0 == 0) {
            System.out.println(-1);
        }
        else if (count5 < 9)
        {
            System.out.println(0);
        }
        else{
            count5 = (count5/9)*9;

            for(int i = 0; i < count5; i++){
                System.out.print(5);
            }
            for(int i = 0; i < count0; i++){
                System.out.print(0);
            }
        }
    }
}
