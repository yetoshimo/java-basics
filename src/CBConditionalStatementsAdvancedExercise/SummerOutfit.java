package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temperature = Integer.parseInt(scan.nextLine());
        String timeOfDay = scan.nextLine();
        String outfit;
        String shoes;
        if (timeOfDay.equals("Morning")) {
            if (10 <= temperature && temperature <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (temperature <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (timeOfDay.equals("Afternoon")) {
            if (10 <= temperature && temperature <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (temperature <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %s degrees, get your %s and %s.", temperature, outfit, shoes);
    }
}
