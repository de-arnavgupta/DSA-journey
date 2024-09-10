package Codeforces.Loops.EasyQuestions;

import java.util.Scanner;

public class YoungPhysicistProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;

        for(int i =0; i < n; i++) {
            int vec1 = sc.nextInt();
            int vec2 = sc.nextInt();
            int vec3 = sc.nextInt();
           sumx += vec1;
           sumy += vec2;
           sumz += vec3;
        }
        if(sumx == 0 && sumy == 0 && sumz == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
