package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 13){
            System.out.println("You can ride the roller coaster!");
        }
        else{
            System.out.println("You can't ride the roller coaster.");
        }
    }
}
