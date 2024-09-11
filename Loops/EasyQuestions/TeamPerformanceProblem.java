package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class TeamPerformanceProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            sum = num1 + num2 + num3;

            if(sum >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
