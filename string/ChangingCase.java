package DSA.string;

import java.util.Scanner;

public class ChangingCase {
    public static String upperToLowerCase(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str = str.replace(str.charAt(i), (char)(str.charAt(i) + 32));
            }
        }
        return str;
    }
    public static String lowerToUpperCase(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str = str.replace(str.charAt(i), (char)(str.charAt(i) - 32));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(upperToLowerCase(str));
        System.out.println(lowerToUpperCase(str));
    }
}
