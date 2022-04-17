package BBConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double clothingPrice = Double.parseDouble(scan.nextLine());
        double clothingPriceDiscount = 0.9;
        double decorPrice = 0.1 * budget;
        if (extras > 150) {
            clothingPrice *= clothingPriceDiscount;
        }
        double totalCost = extras * clothingPrice + decorPrice;
        if (budget - totalCost >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalCost);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - totalCost));
        }
    }
}
