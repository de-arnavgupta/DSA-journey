package DSA.second_trimester.recursion;

public class ReverseString
{
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
    public static String reverseString(String s) {
        if(s.isEmpty()) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
