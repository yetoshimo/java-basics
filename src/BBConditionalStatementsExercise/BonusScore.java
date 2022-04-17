package BBConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = Integer.parseInt(scan.nextLine());
        double bonusPoints;
        if (points <= 100) {
            bonusPoints = 5;
        } else if (points < 1000) {
            bonusPoints = points * 0.2;
        } else {
            bonusPoints = points * 0.1;
        }
        if (points % 2 == 0) {
            bonusPoints += 1;
        } else if (points % 5 == 0) {
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + points);
    }
}
