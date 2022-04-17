package FBNestedLoopExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        for (int i = firstNumber; i <= secondNumber; i++) {
            int evenSum = 0;
            int oddSum = 0;
            String currentNumber = "" + i;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
