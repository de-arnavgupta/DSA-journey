package DSA.leetcode.mediumQuestions.array;

public class ReverseInteger {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int rev = 0;

        for (; x != 0; x /= 10) {
            int digit = x % 10;
            if (rev > max / 10 || (rev == max / 10 && digit > 7)) {
                return 0;
            }
            if (rev < min / 10 || (rev == min / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
        }

        return rev;
    }
}
