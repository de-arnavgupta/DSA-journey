package DSA.dhruvBhaiya.recursion;

public class AllTheWaysToClimbStairs {
    public static void main(String[] args) {
        allTheWaysToClimbStairs(6, "");
    }


    //jump 1, 2 steps
    //print all the ways to climb stairs
    public static void allTheWaysToClimbStairs(int n, String s)
    {
        if(n == 0) {
            System.out.println(s);
            return;
        }
        if(n < 0) {
            return;
        }
        allTheWaysToClimbStairs(n - 1, s + "1");
        allTheWaysToClimbStairs(n - 2, s + "2");
    }
}
