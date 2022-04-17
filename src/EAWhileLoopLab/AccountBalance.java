package EAWhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sumToInvest = scan.nextLine();
        double accountBalance = 0.0;
        while (!sumToInvest.equals("NoMoreMoney")) {
            double nextSum = Double.parseDouble(sumToInvest);
            if (nextSum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f\n", nextSum);
                accountBalance += nextSum;
            }
            sumToInvest = scan.nextLine();
        }
        System.out.printf("Total: %.2f", accountBalance);
    }
}
