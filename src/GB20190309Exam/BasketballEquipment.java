package GB20190309Exam;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearlyFee = Integer.parseInt(scan.nextLine());
        double shoes = yearlyFee * 0.6;
        double kit = shoes * 0.8;
        double ball = kit * 0.25;
        double accessory = ball * 0.2;
        System.out.printf("%.2f", yearlyFee + shoes + kit + ball + accessory);
    }
}
