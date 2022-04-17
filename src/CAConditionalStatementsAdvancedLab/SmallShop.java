package CAConditionalStatementsAdvancedLab;

import java.util.Map;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        if (city.equals("Sofia")) {
            Map<String,Double> prices = Map.of("coffee",0.5,"water",0.8,"beer",1.2,"sweets",1.45,"peanuts",1.6);
            System.out.println(prices.get(product) * quantity);
        } else if (city.equals("Plovdiv")) {
            Map<String,Double> prices = Map.of("coffee",0.4,"water",0.7,"beer",1.15,"sweets",1.3,"peanuts",1.5);
            System.out.println(prices.get(product) * quantity);
        } else {
            Map<String,Double> prices = Map.of("coffee",0.45,"water",0.7,"beer",1.1,"sweets",1.35,"peanuts",1.55);
            System.out.println(prices.get(product) * quantity);
        }
    }
}
