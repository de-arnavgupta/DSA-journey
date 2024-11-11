package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class Reminder_question2 {

    public static String categorizeNumber(Long n) {
        String numStr = String.format("%03d", n);
        int w = numStr.length();

        int lastDigit = Character.getNumericValue(numStr.charAt(w - 1));
        int middleDigit = Character.getNumericValue(numStr.charAt(w -2));
        int firstDigit = Character.getNumericValue(numStr.charAt(w -3));

        if (lastDigit % 2 == 0 && middleDigit % 2 == 0 && firstDigit % 2 == 0)
        {
            return "c1";
        }
        else if (lastDigit % 2 == 0 && middleDigit % 2 == 0)
        {
            return "c2";
        }
        else if ((lastDigit % 2 == 0 && middleDigit % 2 != 0 && firstDigit % 2 != 0)||
                (lastDigit % 2 != 0 && middleDigit % 2 == 0 && firstDigit % 2 != 0)||
                (lastDigit % 2 != 0 && middleDigit % 2 != 0 && firstDigit % 2 ==0))
        {
            return "c3";
        }
        else if(firstDigit % 2 != 0)
        {
            return "c4";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long  num = sc.nextLong();

        System.out.println(categorizeNumber(num));
    }
}
