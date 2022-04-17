package BBConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int addedMinutes = minutes + 15;
        if (addedMinutes >= 60) {
            hour += 1;
            addedMinutes -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%s:%02d", hour, addedMinutes);
    }
}
