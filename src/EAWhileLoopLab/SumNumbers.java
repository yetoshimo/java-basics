package EAWhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetNumber = Integer.parseInt(scan.nextLine());
        int sumOfNumbers = 0;
        do {
            sumOfNumbers += Integer.parseInt(scan.nextLine());
        } while (sumOfNumbers < targetNumber);
        System.out.println(sumOfNumbers);
    }
}
