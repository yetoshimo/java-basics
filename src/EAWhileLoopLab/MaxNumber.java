package EAWhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nextLineEntry = scan.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (!nextLineEntry.equals("Stop")) {
            int nextNumber = Integer.parseInt(nextLineEntry);
            if (nextNumber > maxNumber) {
                maxNumber = nextNumber;
            }
            nextLineEntry = scan.nextLine();
        }
        System.out.println(maxNumber);
    }
}
