package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[] marks = new int[students];

        double sum = 0;
        for (int i = 0; i < students; i++)
        {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < students; i++)
        {
            if(marks[i] >= 95)
            {
                System.out.println("A*");
            }
            else if(marks[i] >= 90)
            {
                System.out.println("A");
            }
            else if(marks[i] >= 85)
            {
                System.out.println("B*");
            }
            else
            {
                System.out.println("B");
            }
            sum +=marks[i];
        }
        double averageMarks = (sum) / students;
        System.out.println(averageMarks);
    }
}