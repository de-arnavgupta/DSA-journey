package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class DivisibleByFiveEleven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 55 == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}