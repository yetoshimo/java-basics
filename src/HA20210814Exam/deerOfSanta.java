package HA20210814Exam;

import java.util.Scanner;

public class deerOfSanta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int amountOfFood = Integer.parseInt(scan.nextLine());
        double firstDeer = Double.parseDouble(scan.nextLine());
        double secondDeer = Double.parseDouble(scan.nextLine());
        double thirdDeer = Double.parseDouble(scan.nextLine());
        double neededFood = (firstDeer + secondDeer + thirdDeer) * numberOfDays;
        if (neededFood <= amountOfFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(amountOfFood - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - amountOfFood));
        }
    }
}
