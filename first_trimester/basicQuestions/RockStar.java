package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class RockStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 15 == 0){
            System.out.println("RockStar");
        }
        else if(num % 3 == 0){
            System.out.println("Rock");
        }
        else if(num % 5 == 0){
            System.out.println("star");
        }
    }
}
