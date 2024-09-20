package DSA.basicQuestions;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        if((num1 + num2)/2 > (num3 + num4)/2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
