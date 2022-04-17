package GB20190309Exam;

import java.util.Map;
import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String competitionLeg = scan.nextLine();
        String typeOfTicket = scan.nextLine();
        int numberOfTickets = Integer.parseInt(scan.nextLine());
        String pictureOption = scan.nextLine();
        Map<String,Double> quarterFinal = Map.of("Standard",55.50,"Premium",105.20,"VIP",118.90);
        Map<String,Double> semiFinal = Map.of("Standard",75.88,"Premium",125.22,"VIP",300.40);
        Map<String,Double> endFinal = Map.of("Standard",110.10,"Premium",160.66,"VIP",400.00);
        Map<String,Map<String,Double>> priceList = Map.of("Quarter final",quarterFinal,"Semi final",semiFinal,"Final",endFinal);
        int picturePrice = 40;
        int fullDiscount = 4000;
        double fullDiscountAmount = 0.75;
        int lessDiscount = 2500;
        double lessDiscountAmount = 0.9;
        double totalAmount = priceList.get(competitionLeg).get(typeOfTicket) * numberOfTickets;
        if (totalAmount > fullDiscount) {
            totalAmount *= fullDiscountAmount;
        } else if (totalAmount > lessDiscount) {
            totalAmount *= lessDiscountAmount;
            if (pictureOption.equals("Y")) {
                totalAmount += picturePrice * numberOfTickets;
            }
        } else {
            if (pictureOption.equals("Y")) {
                totalAmount += picturePrice * numberOfTickets;
            }
        }
        System.out.printf("%.2f", totalAmount);
    }
}
