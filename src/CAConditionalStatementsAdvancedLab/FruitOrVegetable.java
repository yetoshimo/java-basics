package CAConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        switch (item) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
            default -> System.out.println("unknown");
        }
    }
}
