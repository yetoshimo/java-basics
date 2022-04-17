package DBForLoopExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = Integer.parseInt(scan.nextLine());
        ArrayList<Double> oddNumbers = new ArrayList<>();
        ArrayList<Double> evenNumbers = new ArrayList<>();
        for (int i = 1; i <= counter; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(Double.parseDouble(scan.nextLine()));
            } else {
                oddNumbers.add(Double.parseDouble(scan.nextLine()));
            }
        }
        if (!oddNumbers.isEmpty()) {
            System.out.printf("OddSum=%.2f,\n", oddNumbers.stream().mapToDouble(Double::doubleValue).sum());
            System.out.printf("OddMin=%.2f,\n", Collections.min(oddNumbers));
            System.out.printf("OddMax=%.2f,\n", Collections.max(oddNumbers));
        } else {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }
        if (!evenNumbers.isEmpty()) {
            System.out.printf("EvenSum=%.2f,\n", evenNumbers.stream().mapToDouble(Double::doubleValue).sum());
            System.out.printf("EvenMin=%.2f,\n", Collections.min(evenNumbers));
            System.out.printf("EvenMax=%.2f\n", Collections.max(evenNumbers));
        } else {
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
