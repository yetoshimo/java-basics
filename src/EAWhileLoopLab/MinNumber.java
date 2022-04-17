package EAWhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nextLineEntry = scan.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while (!nextLineEntry.equals("Stop")) {
            int nextNumber = Integer.parseInt(nextLineEntry);
            if (nextNumber < minNumber) {
                minNumber = nextNumber;
            }
            nextLineEntry = scan.nextLine();
        }
        System.out.println(minNumber);
    }
}
