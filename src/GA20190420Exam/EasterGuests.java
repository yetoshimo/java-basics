package GA20190420Exam;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGuests = Integer.parseInt(scan.nextLine());
        int availableBudget = Integer.parseInt(scan.nextLine());
        double guestsPerBread = 3;
        int eggPerGuests = 2;
        double priceOfBread = 4;
        double priceOfEgg = 0.45;
        int numberOfBread = (int) Math.ceil(numberOfGuests / guestsPerBread);
        int numberOfEggs = numberOfGuests * eggPerGuests;
        double totalPrice = numberOfBread * priceOfBread
                + numberOfEggs * priceOfEgg;
        if (totalPrice <= availableBudget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.\n", numberOfBread, numberOfEggs);
            System.out.printf("He has %.2f lv. left.", availableBudget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - availableBudget);
        }
    }
}
