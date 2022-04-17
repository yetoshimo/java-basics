package CBConditionalStatementsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        Map<String,Double> priceList = Map.of("Premiere",12.0,"Normal",7.5,"Discount",5.0);
        System.out.printf("%.2f", rows * columns * priceList.get(projection));
    }
}
