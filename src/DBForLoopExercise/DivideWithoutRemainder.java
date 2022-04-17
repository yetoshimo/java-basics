package DBForLoopExercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scan.nextLine());
        int p1, p2, p3;
        p1 = p2 = p3 = 0;
        for (int i = 0; i < countOfNumbers; i++) {
            int nextNumber = Integer.parseInt(scan.nextLine());
            if (nextNumber % 2 == 0) {
                p1 += 1;
            }
            if (nextNumber % 3 == 0) {
                p2 += 1;
            }
            if (nextNumber % 4 == 0) {
                p3 += 1;
            }
        }
        System.out.printf("%.2f%%\n", (double) p1 * 100 / countOfNumbers);
        System.out.printf("%.2f%%\n", (double) p2 * 100 / countOfNumbers);
        System.out.printf("%.2f%%\n", (double) p3 * 100 / countOfNumbers);
    }
}
