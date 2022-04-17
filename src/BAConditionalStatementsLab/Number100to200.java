package BAConditionalStatementsLab;

import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        int lowerLimit = 100;
        int upperLimit = 200;
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        if (number < lowerLimit) {
            System.out.printf("Less than %s", lowerLimit);
        } else if (number <= upperLimit) {
            System.out.printf("Between %s and %s", lowerLimit, upperLimit);
        } else {
            System.out.printf("Greater than %s", upperLimit);
        }
    }
}
