package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int numberOfNights = Integer.parseInt(scan.nextLine());
        double studioPrice;
        double apartmentPrice;
        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (numberOfNights > 7 && numberOfNights <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (numberOfNights > 14) {
                studioPrice = studioPrice * 0.7;
                apartmentPrice = apartmentPrice * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.2;
            apartmentPrice = 68.7;
            if (numberOfNights > 14) {
                studioPrice = studioPrice * 0.8;
                apartmentPrice = apartmentPrice * 0.9;
            }
        } else {
            studioPrice = 76;
            apartmentPrice = 77;
            if (numberOfNights > 14) {
                apartmentPrice = apartmentPrice * 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice * numberOfNights);
        System.out.printf("Studio: %.2f lv.", studioPrice * numberOfNights);
    }
}
