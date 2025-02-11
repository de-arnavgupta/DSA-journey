package DSA.second_trimester.recursion;

public class PowerN
{
    public static void main(String[] args) {
        System.out.println(powerN(2, 3));
    }

    public static int powerN(int base, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            int halfPower = powerN(base, n / 2);
            return halfPower * halfPower;
        }
        else
        {
            return base * powerN(base, n - 1);
        }
    }
}