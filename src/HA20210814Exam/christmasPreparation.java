package HA20210814Exam;

import java.util.Map;
import java.util.Scanner;

public class christmasPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSheets = Integer.parseInt(scan.nextLine());
        int numberOfRolls = Integer.parseInt(scan.nextLine());
        double amountOfAdhesive = Double.parseDouble(scan.nextLine());
        int discountRate = Integer.parseInt(scan.nextLine());
        Map<String,Double> priceList = Map.of("Sheets",5.8,"Rolls",7.2,"Adhesive",1.2);
        double totalSum = numberOfSheets * priceList.get("Sheets") +
                          numberOfRolls * priceList.get("Rolls") +
                          amountOfAdhesive * priceList.get("Adhesive");
        System.out.printf("%.3f", totalSum * (1 - ((double) discountRate / 100)));
    }
}
