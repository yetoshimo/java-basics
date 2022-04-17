package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double StrawberryPrice = Double.parseDouble(scan.nextLine());
        double BananaAmount = Double.parseDouble(scan.nextLine());
        double OrangeAmount = Double.parseDouble(scan.nextLine());
        double RaspberryAmount = Double.parseDouble(scan.nextLine());
        double RaspberryPrice = StrawberryPrice * 0.5;
        double StrawberryAmount = Double.parseDouble(scan.nextLine());
        double OrangePrice = RaspberryPrice * 0.6;
        double BananaPrice = RaspberryPrice * 0.2;
        double totalPrice = StrawberryAmount * StrawberryPrice +
                BananaAmount * BananaPrice +
                OrangeAmount * OrangePrice +
                RaspberryAmount * RaspberryPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
