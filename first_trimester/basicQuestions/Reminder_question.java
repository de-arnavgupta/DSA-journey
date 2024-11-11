package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class Reminder_question
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k < n && k >= 0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
