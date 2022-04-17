package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                System.out.printf("Camp - %.2f", budget * 0.3);
            } else {
                System.out.printf("Hotel - %.2f", budget * 0.7);
            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")) {
                System.out.printf("Camp - %.2f", budget * 0.4);
            } else {
                System.out.printf("Hotel - %.2f", budget * 0.8);
            }
        } else {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget * 0.9);
        }
    }
}
