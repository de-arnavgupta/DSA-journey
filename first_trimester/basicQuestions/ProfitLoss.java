package DSA.first_trimester.basicQuestions;

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();

        int profitLoss = Math.abs(costPrice - sellingPrice);


        if (sellingPrice > costPrice) {
            System.out.println("1");
            System.out.println(profitLoss);
        } else {
            System.out.println("-1");
            System.out.println(profitLoss);
        }

    }
}
