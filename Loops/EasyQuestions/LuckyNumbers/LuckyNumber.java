package Codeforces.Loops.EasyQuestions.LuckyNumbers;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long lastdigit = 0;
        int count = 0;

        for(long n = num; n > 0; n /= 10)
        {
            lastdigit = n % 10;
            if(lastdigit == 4 || lastdigit == 7){
                count++;
            }
        }
        if(count == 4 || count == 7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
