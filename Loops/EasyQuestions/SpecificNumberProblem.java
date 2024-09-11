package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class SpecificNumberProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long position = sc.nextLong();

        if (num%2==1){
            if (position<=((num/2))+1){
                System.out.println(2*position-1);
            }else {
                position -= (num/2)+1;
                System.out.println(2*position);
            }
        }
        else {
            if (position<=(num/2)){
                System.out.println(2*position-1);
            }else {
                position -= (num/2);
                System.out.println(2*position);
            }
        }
    }
}
