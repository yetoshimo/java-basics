package CAConditionalStatementsAdvancedLab;

import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer,String> calendar = Map.of(1,"Monday",2,"Tuesday",3,"Wednesday",4,"Thursday",5,"Friday",6,"Saturday",7,"Sunday");
        int dayNumber = Integer.parseInt(scan.nextLine());
        System.out.println(calendar.getOrDefault(dayNumber, "Error"));
    }
}
