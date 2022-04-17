package EAWhileLoopLab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetNumber = Integer.parseInt(scan.nextLine());
        int currentNumber = 1;
        while (currentNumber <= targetNumber) {
            System.out.println(currentNumber);
            currentNumber = (currentNumber * 2) + 1;
        }
    }
}
