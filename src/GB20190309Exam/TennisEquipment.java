package GB20190309Exam;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfRacket = Double.parseDouble(scan.nextLine());
        double selfPart = 1.0 / 8;
        double sponsorsPart = 7.0 / 8;
        int numberOfRackets = Integer.parseInt(scan.nextLine());
        int numberOfShoePairs = Integer.parseInt(scan.nextLine());
        double priceOfShoes = priceOfRacket * 1 / 6;
        double midSum = (priceOfRacket * numberOfRackets) + (priceOfShoes * numberOfShoePairs);
        double accessories = midSum * 0.2;
        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor((midSum + accessories) * selfPart));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil((midSum + accessories) * sponsorsPart));
    }
}
