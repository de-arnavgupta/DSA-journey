package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class OddNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % 2 ==0){
            num1+=1;
        }
        while(num1 <= num2){
            System.out.println(num1);
            num1+=2;

        }
    }
}
