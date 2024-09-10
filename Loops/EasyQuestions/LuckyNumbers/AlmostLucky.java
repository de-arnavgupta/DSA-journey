package codeforces;

import java.util.Scanner;

public class AlmostLucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (isAlmostLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isAlmostLucky(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isLucky(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}