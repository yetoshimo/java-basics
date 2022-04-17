package FBNestedLoopExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNumber = Integer.parseInt(scan.nextLine());
        int currentNumber = 1;
        pyramid:
        for (int row = 1; row <= initialNumber; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
                if (currentNumber > initialNumber) {
                    break pyramid;
                }
            }
            System.out.println();
        }
    }
}
