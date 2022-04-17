package FBNestedLoopExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int primeNumbers = 0;
        int nonPrimeNumbers = 0;
        boolean nonPrime = false;
        while (!command.equals("stop")) {
            int currentNumber = Integer.parseInt(command);
            if (currentNumber < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < currentNumber; i++) {
                    if (currentNumber % i == 0) {
                        nonPrimeNumbers += currentNumber;
                        nonPrime = true;
                        break;
                    }
                }
                if (!nonPrime) {
                    primeNumbers += currentNumber;
                }
            }
            nonPrime = false;
            command = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbers);
    }
}
