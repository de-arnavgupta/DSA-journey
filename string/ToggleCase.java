package DSA.string;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str = str.substring(0, i) + (char)(str.charAt(i) + 32) + str.substring(i + 1);
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str = str.substring(0, i) + (char)(str.charAt(i) - 32) + str.substring(i + 1);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }
}
