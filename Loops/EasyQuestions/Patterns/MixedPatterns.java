package codeforces.loops.easyQuestions.patterns;

import java.util.Scanner;

public class MixedPatterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char temp = 'A';
        int tempnum = 1;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(temp);
            }
            temp++;
            System.out.println();
        }
        temp = 'A';
        System.out.println();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(temp);
                temp++;
            }
            temp = 'A';
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(tempnum);
            }
            tempnum++;
            System.out.println();
        }
        tempnum = 1;
        System.out.println();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(tempnum);
                tempnum++;
            }
            tempnum = 1;
            System.out.println();
        }
    }
}
