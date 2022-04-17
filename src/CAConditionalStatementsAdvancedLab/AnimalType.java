package CAConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animalName = scan.nextLine();
        switch (animalName) {
            case "dog" -> System.out.println("mammal");
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            default -> System.out.println("unknown");
        }
    }
}
