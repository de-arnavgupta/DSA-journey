package DSA.trimester3.recurssion;

public class Power {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pow(-2, 3, 3));
    }
}



// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
class Solution {
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int power = power(A, B, C);
        System.out.println(power);
        if(power < 0)
        {
            return (power % C) + C;
        }
        return power % C;
    }

    public int power(int base, int power, int C)
    {
        if(power == 0)
        {
            return 1;
        }
        if(power % 2 == 0)
        {
            int result = power(base, power/2, C) % C;
            return (result * result) % C;
        }
        else
        {
            int result = power(base, power/2, C) % C;
            return (base * result * result) % C;
        }
    }
}
