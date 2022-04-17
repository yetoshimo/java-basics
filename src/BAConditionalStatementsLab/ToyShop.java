package BAConditionalStatementsLab;

import java.util.Map;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
//        Map<String,Double> prices =  new HashMap<String,Double>();
//        prices.put("puzzle",2.6);
//        prices.put("doll",3.0);
//        prices.put("teddyBear",4.1);
//        prices.put("minion",8.2);
//        prices.put("truck",2.0);
        Map<String,Double> prices = Map.of("puzzle",2.6,"doll",3.0,"teddyBear",4.1,"minion",8.2,"truck",2.0);
        double discountedPrice = 0.75;
        double rentSubtract = 0.9;
        int discountNumber = 50;
        Scanner scan = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scan.nextLine());
        int numberOfPuzzles = Integer.parseInt(scan.nextLine());
        int numberOfDolls = Integer.parseInt(scan.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scan.nextLine());
        int numberOfMinions = Integer.parseInt(scan.nextLine());
        int numberOfTrucks = Integer.parseInt(scan.nextLine());
        int numberOfToys = numberOfPuzzles + numberOfDolls + numberOfTeddyBears + numberOfMinions + numberOfTrucks;
        double sumOfToys = numberOfDolls * prices.get("doll") +
                            numberOfMinions * prices.get("minion") +
                            numberOfTrucks * prices.get("truck") +
                            numberOfPuzzles * prices.get("puzzle") +
                            numberOfTeddyBears * prices.get("teddyBear");
        if (numberOfToys >= discountNumber) {
            sumOfToys *= discountedPrice;
        }
        sumOfToys *= rentSubtract;
        if (holidayPrice <= sumOfToys) {
            System.out.printf("Yes! %.2f lv left.", sumOfToys - holidayPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", holidayPrice - sumOfToys);
        }
    }
}
