package DSA.first_trimester.string;

import java.util.Scanner;

public class StringtoInt {
    public static int stringToInt(char chr) {
        return chr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            System.out.println(stringToInt(str.charAt(i)));
        }
    }
}
