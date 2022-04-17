package GA20190420Exam;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfFlour = Double.parseDouble(scan.nextLine());
        double amountOfFlour = Double.parseDouble(scan.nextLine());
        double amountOfSugar = Double.parseDouble(scan.nextLine());
        int numberOfPuffPastry = Integer.parseInt(scan.nextLine());
        int numberOfYeast = Integer.parseInt(scan.nextLine());
        double priceOfSugar = priceOfFlour * 0.75;
        double priceOfPuffPastry = priceOfFlour * 1.1;
        double priceOfYeast = priceOfSugar * 0.2;
        double totalSum = amountOfFlour * priceOfFlour
                + amountOfSugar * priceOfSugar
                + numberOfPuffPastry * priceOfPuffPastry
                + numberOfYeast * priceOfYeast;
        System.out.printf("%.2f",totalSum);
    }
}
