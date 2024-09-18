package codeforces.loops.easyQuestions;

import java.util.Scanner;

public class IntersectionOfBoundaries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        if(l1 > r2 || l2 > r1) {
            System.out.println(-1);
        }
        int intersectionStart = Math.max(l1, l2);
        int intersectionEnd = Math.min(r1, r2);
        System.out.println(intersectionStart + " " + intersectionEnd);
    }
}
