package FBNestedLoopExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNumber = Integer.parseInt(scan.nextLine());
        StringBuilder magicalNumber = new StringBuilder();
        boolean isMagical = false;
        for (int i = 1111; i <= 9999; i++) {
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                int currentDigit = Integer.parseInt("" + String.valueOf(i).charAt(j));
                if (currentDigit > 0 && initialNumber % currentDigit == 0) {
                    magicalNumber.append(currentDigit);
                    isMagical = true;
                } else {
                    isMagical = false;
                    magicalNumber.setLength(0);
                    break;
                }
            }
            if (isMagical) {
                System.out.print(magicalNumber + " ");
            }
            magicalNumber.setLength(0);
        }
    }
}
