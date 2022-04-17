package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfYear = scan.nextLine();
        int publicHolidays = Integer.parseInt(scan.nextLine());
        int travelWeekends = Integer.parseInt(scan.nextLine());
        int numberOfWeekends = 48;
        double leapYearAddition = 1.15;
        double nonWorkingWeekend = (float)3 / 4;
        double publicHolidayTime = (float)2 / 3;
        double sofiaPlays = (numberOfWeekends - travelWeekends) * nonWorkingWeekend;
        sofiaPlays += publicHolidays * publicHolidayTime;
        double totalPlayed = sofiaPlays + travelWeekends;
        if (typeOfYear.equals("leap")) {
            totalPlayed *= leapYearAddition;
        }
        System.out.printf("%.0f",Math.floor(totalPlayed));
    }
}
