package CAConditionalStatementsAdvancedLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<String> weekdays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "grapefruit", "kiwi", "pineapple", "grapes"));
        if (!days.contains(day) || !fruits.contains(fruit)) {
            System.out.println("error");
        } else {
            if (weekdays.contains(day)) {
                Map<String, Double> prices = Map.of("banana", 2.5, "apple", 1.2, "orange", 0.85, "grapefruit", 1.45, "kiwi", 2.7, "pineapple", 5.5, "grapes", 3.85);
                System.out.printf("%.2f",prices.get(fruit) * quantity);
            } else {
                Map<String, Double> prices = Map.of("banana", 2.7, "apple", 1.25, "orange", 0.9, "grapefruit", 1.6, "kiwi", 3.0, "pineapple", 5.6, "grapes", 4.2);
                System.out.printf("%.2f",prices.get(fruit) * quantity);
            }
        }
    }
}
