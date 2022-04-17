package CBConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        String oddEven;
        if (operator.equals("-") || operator.equals("+") || operator.equals("*")) {
            if (operator.equals("+")) {
                if ((numberOne + numberTwo) % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%s %s %s = %s - %s", numberOne, operator, numberTwo, numberOne + numberTwo, oddEven);
            } else if (operator.equals("-")) {
                if ((numberOne - numberTwo) % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%s %s %s = %s - %s", numberOne, operator, numberTwo, numberOne - numberTwo, oddEven);
            } else {
                if ((numberOne * numberTwo) % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%s %s %s = %s - %s", numberOne, operator, numberTwo, numberOne * numberTwo, oddEven);
            }
        } else if ((operator.equals("/") || operator.equals("%")) && numberTwo != 0) {
            if (operator.equals("/")) {
                System.out.printf("%s %s %s = %.2f", numberOne, operator, numberTwo, (float)numberOne / numberTwo);
            } else {
                System.out.printf("%s %s %s = %s", numberOne, operator, numberTwo, numberOne % numberTwo);
            }
        } else {
            System.out.printf("Cannot divide %s by zero", numberOne);
        }
    }
}
