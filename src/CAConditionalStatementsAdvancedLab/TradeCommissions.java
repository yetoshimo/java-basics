package CAConditionalStatementsAdvancedLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Sofia", "Varna", "Plovdiv"));
        if (!cities.contains(city) || sales < 0) {
            System.out.println("error");
        } else {
            if (city.equals("Sofia")) {
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.05);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.07);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else {
                    System.out.printf("%.2f", sales * 0.12);
                }
            } else if (city.equals("Varna")) {
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.045);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.075);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.1);
                } else {
                    System.out.printf("%.2f", sales * 0.13);
                }
            } else {
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.055);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.12);
                } else {
                    System.out.printf("%.2f", sales * 0.145);
                }
            }
        }
    }
}
