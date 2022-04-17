package GA20190420Exam;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGuests = Integer.parseInt(scan.nextLine());
        double priceOfServing = Double.parseDouble(scan.nextLine());
        double availableBudget = Double.parseDouble(scan.nextLine());
        if (numberOfGuests >= 10 && numberOfGuests <= 15) {
            priceOfServing = priceOfServing * 0.85;
        } else if (numberOfGuests > 15 && numberOfGuests <= 20) {
            priceOfServing = priceOfServing * 0.8;
        } else if (numberOfGuests > 20) {
            priceOfServing = priceOfServing * 0.75;
        }
        double priceOfCake = availableBudget * 0.1;
        double totalPrice = numberOfGuests * priceOfServing + priceOfCake;
        if (totalPrice <= availableBudget) {
            System.out.printf("It is party time! %.2f leva left.", availableBudget - totalPrice);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalPrice - availableBudget);
        }
    }
}
