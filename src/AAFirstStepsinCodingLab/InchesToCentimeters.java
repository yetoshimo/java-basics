package AAFirstStepsinCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {
        double conversion = 2.54;
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double convert = conversion * length;
        System.out.println(convert);
    }
}
