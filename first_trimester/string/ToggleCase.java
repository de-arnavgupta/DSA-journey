package DSA.first_trimester.string;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, (char)(c + 32));
            }
            else if(c >= 'a' && c <= 'z') {
                sb.setCharAt(i, (char)(c - 32));
            }
        }
        str = sb.toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }
}
