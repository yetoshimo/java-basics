package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        int period = Integer.parseInt(scan.nextLine());
        double interest = Double.parseDouble(scan.nextLine());
        System.out.printf("%.2f", deposit + ((deposit * interest / 100) / 12) * period);
    }
}
