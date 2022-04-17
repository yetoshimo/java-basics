package FANestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isFound = false;
        search:
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, i + j);
                    isFound = true;
                    break search;
                }
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
