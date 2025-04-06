package DSA.third_trimester.stack;

public class DeleteConsecutiveDuplicateFromAString
{
    public static String deleteConsecutiveDuplicates(String s) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(deleteConsecutiveDuplicates(s));
    }
}
