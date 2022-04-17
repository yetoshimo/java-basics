package CAConditionalStatementsAdvancedLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        ArrayList<String> workingDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
        if (hour >= 10 && hour < 18 && workingDays.contains(day)) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
