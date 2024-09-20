package DSA.basicQuestions;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
