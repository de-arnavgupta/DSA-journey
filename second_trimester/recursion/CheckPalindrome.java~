package DSA.second_trimester.recursion;

public class CheckPalindrome
{
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));
    }
    public static boolean checkPalindrome(String str, int start, int end) {
        if(start >= end)
        {
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && checkPalindrome(str, start + 1, end - 1);
    }
}
