package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        double minusExpenses = 7.0 / 8.0;
        Scanner scan = new Scanner(System.in);
        int cake = 45;
        double waffle = 5.8;
        double pancake = 3.2;
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int numberOfBakeries = Integer.parseInt(scan.nextLine());
        int numberOfCakes = Integer.parseInt(scan.nextLine());
        int numberOfWaffles = Integer.parseInt(scan.nextLine());
        int numberOfPancakes = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f", ((((numberOfCakes * cake) +
                (numberOfWaffles * waffle) +
                (numberOfPancakes * pancake)) * numberOfDays) * numberOfBakeries) * minusExpenses);
    }
}
