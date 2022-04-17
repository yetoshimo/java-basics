package HA20210814Exam;

import java.util.Map;
import java.util.Scanner;

public class finalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDancers = Integer.parseInt(scan.nextLine());
        double numberOfPoints = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();
        Map<String,Map<String,Double>> table = Map.of("Bulgaria",Map.of("summer",0.05,"winter",0.08),"Abroad",Map.of("summer",0.1,"winter",0.15));
        double receivedPoints;
        if (place.equals("Abroad")) {
            receivedPoints = (numberOfDancers * numberOfPoints) * 1.5;
        } else {
            receivedPoints = numberOfDancers * numberOfPoints;
        }
        receivedPoints -= receivedPoints * table.get(place).get(season);
        double charityAmount = receivedPoints * 0.75;
        double leftAmount = receivedPoints - charityAmount;
        double amountPerDancer = leftAmount / numberOfDancers;
        System.out.printf("Charity - %.2f\n", charityAmount);
        System.out.printf("Money per dancer - %.2f", amountPerDancer);
    }
}
