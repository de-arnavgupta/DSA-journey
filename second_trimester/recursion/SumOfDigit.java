package DSA.second_trimester.recursion;

public class SumOfDigit
{
    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
    }

    public static int sumOfDigit(int n) {
        n = Math.abs(n);
        if(n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigit(n / 10);
    }
}
