package DSA.loops.easyQuestions;

import java.util.Scanner;

public class NextPrimeNumberProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (isPrime(num2)) {
            int nextPrime = getNextPrime(num1);
            if (nextPrime == num2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getNextPrime(int num) {
        int next = num + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}