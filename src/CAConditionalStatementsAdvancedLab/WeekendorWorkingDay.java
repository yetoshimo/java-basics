package CAConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WeekendorWorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayName = scan.nextLine();
        switch (dayName) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
