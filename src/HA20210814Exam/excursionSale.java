package HA20210814Exam;

import java.util.Scanner;

public class excursionSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seaExcursion = Integer.parseInt(scan.nextLine());
        int mountainExcursion = Integer.parseInt(scan.nextLine());
        int profit = 0;
        int seaPacket = 680;
        int mountainPacket = 499;
        while (seaExcursion > 0 || mountainExcursion > 0) {
            String nextCommand = scan.nextLine();
            if (nextCommand.equals("Stop")) {
                break;
            } else if (nextCommand.equals("sea")) {
                if (seaExcursion > 0) {
                    profit += seaPacket;
                    seaExcursion--;
                }
            } else {
                if (mountainExcursion > 0) {
                    profit += mountainPacket;
                    mountainExcursion--;
                }
            }
        }
        if (seaExcursion == 0 && mountainExcursion == 0) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
