package AAFirstStepsinCodingLab;

import java.util.Scanner;

public class YardGardening {
    public static void main(String[] args) {
        double price = 7.61;
        double discount = 0.18;
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double totalPrice = area * price;
        String finalPrice = String.format("The final price is: %s lv.", totalPrice * (1 - discount));
        String discountedPrice = String.format("The discount is: %s lv.", totalPrice * discount);
        System.out.println(finalPrice + "\n" + discountedPrice);
    }
}
