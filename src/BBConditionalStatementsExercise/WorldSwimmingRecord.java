package BBConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double metersPerSecond = Double.parseDouble(scan.nextLine());
        double addedSeconds = 12.5;  // for every 15 meters
        double addedMeters = 15;
        double swimmingTime = meters * metersPerSecond;
        swimmingTime += Math.floor(meters / addedMeters) * addedSeconds;
        if (record <= swimmingTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTime - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTime);
        }
    }
}
