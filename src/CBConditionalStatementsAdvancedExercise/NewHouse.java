package CBConditionalStatementsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowerType = scan.nextLine();
        int numberOfFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        Map<String,Double> priceList = Map.of("Roses",5.0,"Dahlias",3.8,"Tulips",2.8,"Narcissus",3.0,"Gladiolus",2.5);
        double discount = 1.0;
        if (flowerType.equals("Roses") && numberOfFlowers > 80) {
            discount = 0.9;
        } else if (flowerType.equals("Dahlias") && numberOfFlowers > 90) {
            discount = 0.85;
        } else if (flowerType.equals("Tulips") && numberOfFlowers > 80) {
            discount = 0.85;
        } else if (flowerType.equals("Narcissus") && numberOfFlowers < 120) {
            discount = 1.15;
        } else if (flowerType.equals("Gladiolus") && numberOfFlowers < 80) {
            discount = 1.2;
        }
        double totalPrice = numberOfFlowers * priceList.get(flowerType) * discount;
        if (totalPrice > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - totalPrice));
        } else {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", numberOfFlowers, flowerType, budget - totalPrice);
        }
    }
}
