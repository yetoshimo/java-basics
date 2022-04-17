package EBWhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyAmount = Math.floor(Double.parseDouble(scan.nextLine()) * 100);
        int numberOfCoins = 0;
        while (moneyAmount > 0) {
            if (moneyAmount >= 200) {
                numberOfCoins++;
                moneyAmount -= 200;
            } else if (moneyAmount >= 100) {
                numberOfCoins++;
                moneyAmount -= 100;
            } else if (moneyAmount >= 50) {
                numberOfCoins++;
                moneyAmount -= 50;
            } else if (moneyAmount >= 20) {
                numberOfCoins++;
                moneyAmount -= 20;
            } else if (moneyAmount >= 10) {
                numberOfCoins++;
                moneyAmount -= 10;
            } else if (moneyAmount >= 5) {
                numberOfCoins++;
                moneyAmount -= 5;
            } else if (moneyAmount >= 2) {
                numberOfCoins++;
                moneyAmount -= 2;
            } else if (moneyAmount >= 1) {
                numberOfCoins++;
                moneyAmount -= moneyAmount;
            }
        }
        System.out.println(numberOfCoins);
    }
}
