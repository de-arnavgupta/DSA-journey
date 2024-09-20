package DSA.basicQuestions;

import java.util.Scanner;

public class BonusProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int service = sc.nextInt();

        if(service > 5){
            System.out.println("Yes " + name + " will recieve bonus.");
        }
        else {
            System.out.println("No " + name + " will not recieve bonus.");
        }
    }
}
