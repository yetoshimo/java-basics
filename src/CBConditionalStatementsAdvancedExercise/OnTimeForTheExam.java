package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oneHour = 60;
        int thirtyMinutes = 30;
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinute = Integer.parseInt(scan.nextLine());
        int examTime = examHour * oneHour + examMinute;
        int arrivalTime = arrivalHour * oneHour + arrivalMinute;
        int difference = arrivalTime - examTime;
        int lateHour;
        int lateMinutes;
        int earlyHour;
        int earlyMinutes;
        if (difference > 0) {
            System.out.println("Late");
            lateHour = difference / oneHour;
            if (lateHour != 0) {
                difference -= lateHour * oneHour;
            }
            lateMinutes = difference;
            if (lateHour == 0) {
                System.out.printf("%s minutes after the start", lateMinutes);
            } else {
                System.out.printf("%s:%02d hours after the start", lateHour, lateMinutes);
            }
        } else if (Math.abs(difference) <= thirtyMinutes) {
            System.out.println("On Time");
            if (difference != 0) {
                lateMinutes = Math.abs(difference);
                System.out.printf("%s minutes before the start", lateMinutes);
            }
        } else {
            System.out.println("Early");
            earlyHour = Math.abs(difference / 60);
            if (earlyHour != 0) {
                difference += earlyHour * oneHour;
            }
            earlyMinutes = Math.abs(difference);
            if (earlyHour == 0) {
                System.out.printf("%s minutes before the start", earlyMinutes);
            } else {
                System.out.printf("%s:%02d hours before the start", earlyHour, earlyMinutes);
            }
        }
    }
}
