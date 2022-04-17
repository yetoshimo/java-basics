package DAForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ageOfLily = Integer.parseInt(scan.nextLine());
        double priceOfMachine = Double.parseDouble(scan.nextLine());
        int priceOfToys = Integer.parseInt(scan.nextLine());
        int savings = 0;
        for (int i = 1; i <= ageOfLily; i++) {
            if (i % 2 == 0) {
                savings += (10 * (i / 2)) - 1;
            } else {
                savings += priceOfToys;
            }
        }
        if (savings >= priceOfMachine) {
            System.out.printf("Yes! %.2f", savings - priceOfMachine);
        } else {
            System.out.printf("No! %.2f", priceOfMachine - savings);
        }
    }
}
