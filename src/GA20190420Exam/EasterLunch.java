package GA20190420Exam;

import java.util.Map;
import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfBread = Integer.parseInt(scan.nextLine());
        int numberOfDozenEggs = Integer.parseInt(scan.nextLine());
        int kilogramsOfCookies = Integer.parseInt(scan.nextLine());
        int dozenEggs = 12;
        Map<String,Double> priceList = Map.of("Bread",3.2,"DozenEgg",4.35,"Cookie",5.4,"Egg",0.15);
        double totalPrice = numberOfBread * priceList.get("Bread")
                + numberOfDozenEggs * priceList.get("DozenEgg")
                + kilogramsOfCookies * priceList.get("Cookie")
                + numberOfDozenEggs * dozenEggs * priceList.get("Egg");
        System.out.printf("%.2f", totalPrice);
    }
}
