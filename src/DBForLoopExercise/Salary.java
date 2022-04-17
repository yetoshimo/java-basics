package DBForLoopExercise;

import java.util.Map;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> priceList = Map.of("Facebook",150,"Instagram",100,"Reddit",50);
        int numberOfTabs = Integer.parseInt(scan.nextLine());
        int salaryAmount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfTabs; i++) {
            String nextTab = scan.nextLine();
            if (priceList.containsKey(nextTab)) {
                salaryAmount -= priceList.get(nextTab);
                if (salaryAmount <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }
            }
        }
        if (salaryAmount > 0) {
            System.out.println(salaryAmount);
        }
    }
}
