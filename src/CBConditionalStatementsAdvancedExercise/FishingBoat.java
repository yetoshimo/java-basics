package CBConditionalStatementsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        Map<String,Integer> priceList = Map.of("Spring",3000,"Summer",4200,"Autumn",4200,"Winter",2600);
        double discount;
        double additionalDiscount = 1.0;
        if (numberOfPeople <= 6) {
            discount = 0.9;
        } else if (numberOfPeople <= 11) {
            discount = 0.85;
        } else {
            discount = 0.75;
        }
        if (numberOfPeople % 2 == 0 && !season.equals("Autumn")) {
            additionalDiscount = 0.95;
        }
        double totalPrice = priceList.get(season) * discount * additionalDiscount;
        if (totalPrice > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        }
    }
}
