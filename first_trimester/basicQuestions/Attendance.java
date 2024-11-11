package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalClass = sc.nextDouble();
        double classAttended = sc.nextDouble();

        if((classAttended/totalClass)*100 >= 75){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
