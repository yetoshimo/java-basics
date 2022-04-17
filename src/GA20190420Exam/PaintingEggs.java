package GA20190420Exam;

import java.util.Map;
import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eggSize = scan.nextLine();
        String eggColor = scan.nextLine();
        int numberOfBatches = Integer.parseInt(scan.nextLine());
        double productionExpenses = 0.65;
        Map<String,Integer> large = Map.of("Red",16,"Green",12,"Yellow",9);
        Map<String,Integer> medium = Map.of("Red",13,"Green",9,"Yellow",7);
        Map<String,Integer> small = Map.of("Red",9,"Green",8,"Yellow",5);
        double totalPrice;
        if (eggSize.equals("Large")) {
            totalPrice = large.get(eggColor) * numberOfBatches;
        } else if (eggSize.equals("Medium")) {
            totalPrice = medium.get(eggColor) * numberOfBatches;
        } else {
            totalPrice = small.get(eggColor) * numberOfBatches;
        }
        System.out.printf("%.2f leva.", totalPrice * productionExpenses);
    }
}
