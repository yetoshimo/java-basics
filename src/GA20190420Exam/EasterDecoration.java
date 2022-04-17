package GA20190420Exam;

import java.util.Map;
import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCustomers = Integer.parseInt(scan.nextLine());
        Map<String,Double> priceList = Map.of("basket",1.5,"wreath",3.8,"chocolate bunny",7.0);
        double totalPrice = 0;
        int itemCounter = 0;
        double totalBill = 0;
        for (int i = 0; i < numberOfCustomers; i++) {
            String boughtItem = scan.nextLine();
            while (!boughtItem.equals("Finish")) {
                totalPrice += priceList.get(boughtItem);
                itemCounter++;
                boughtItem = scan.nextLine();
            }
            if (itemCounter % 2 == 0) {
                totalPrice = totalPrice * 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", itemCounter, totalPrice);
            totalBill += totalPrice;
            itemCounter = 0;
            totalPrice = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalBill / numberOfCustomers);
    }
}
