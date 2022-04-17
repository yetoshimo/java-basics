package CAConditionalStatementsAdvancedLab;

import java.util.Map;
import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        Map<String,Integer> prices = Map.of("Monday",12,"Tuesday",12,"Wednesday",14,"Thursday",14,"Friday",12,"Saturday",16,"Sunday",16);
        System.out.println(prices.get(day));
    }
}
