package EBWhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        double savedMoney = Double.parseDouble(scan.nextLine());
        int spendCounter = 0;
        int spendLimit = 5;
        int totalDays = 0;
        while (neededMoney > savedMoney && spendCounter < spendLimit) {
            String action = scan.nextLine();
            totalDays++;
            double moneyAmount = Double.parseDouble(scan.nextLine());
            if (action.equals("save")) {
                spendCounter = 0;
                savedMoney += moneyAmount;
            } else if (action.equals("spend")) {
                spendCounter += 1;
                savedMoney -= moneyAmount;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }
            }
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        }
        if (savedMoney >= neededMoney) {
            System.out.printf("You saved the money for %s days.", totalDays);
        }
    }
}
