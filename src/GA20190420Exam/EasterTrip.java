package GA20190420Exam;

import java.util.Map;
import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String tripDates = scan.nextLine();
        int numberOfNights = Integer.parseInt(scan.nextLine());
        Map<String,Integer> france = Map.of("21-23",30,"24-27",35,"28-31",40);
        Map<String,Integer> italy = Map.of("21-23",28,"24-27",32,"28-31",39);
        Map<String,Integer> germany = Map.of("21-23",32,"24-27",37,"28-31",43);
        double totalPrice;
        if (destination.equals("France")) {
            totalPrice = france.get(tripDates) * numberOfNights;
        } else if (destination.equals("Italy")) {
            totalPrice = italy.get(tripDates) * numberOfNights;
        } else {
            totalPrice = germany.get(tripDates) * numberOfNights;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
