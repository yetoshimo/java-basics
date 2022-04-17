package CAConditionalStatementsAdvancedLab;

import java.util.Map;
import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> priceList = Map.of("room for one person", 18, "apartment", 25, "president apartment", 35);
        int numberOfDays = Integer.parseInt(scan.nextLine()) - 1;
        String typeOfAccommodation = scan.nextLine();
        String rating = scan.nextLine();
        double positiveRating = 1.25;
        double negativeRating = 0.9;
        double totalPrice;
        if (typeOfAccommodation.equals("room for one person")) {
            if (rating.equals("positive")) {
                System.out.printf("%.2f", numberOfDays * priceList.get(typeOfAccommodation) * positiveRating);
            } else {
                System.out.printf("%.2f", numberOfDays * priceList.get(typeOfAccommodation) * negativeRating);
            }
        } else if (typeOfAccommodation.equals("apartment")) {
            if (numberOfDays < 10) {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.7;
            } else if (numberOfDays <= 15) {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.65;
            } else {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.5;
            }

            if (rating.equals("positive")) {
                System.out.printf("%.2f", totalPrice * positiveRating);
            } else {
                System.out.printf("%.2f", totalPrice * negativeRating);
            }
        } else {
            if (numberOfDays < 10) {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.9;
            } else if (numberOfDays <= 15) {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.85;
            } else {
                totalPrice = numberOfDays * priceList.get(typeOfAccommodation) * 0.8;
            }

            if (rating.equals("positive")) {
                System.out.printf("%.2f", totalPrice * positiveRating);
            } else {
                System.out.printf("%.2f", totalPrice * negativeRating);
            }
        }
    }
}
