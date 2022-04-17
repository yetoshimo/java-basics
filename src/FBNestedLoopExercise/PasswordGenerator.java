package FBNestedLoopExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        StringBuilder password = new StringBuilder();
        StringBuilder allOptions = new StringBuilder();
        for (int i = 1; i < firstNumber; i++) {
            for (int j = 1; j < firstNumber; j++) {
                for (int k = 97; k < secondNumber + 97; k++) {
                    for (int l = 97; l < secondNumber + 97; l++) {
                        for (int m = Math.max(i, j) + 1; m < firstNumber + 1; m++) {
                            password.append(i).append(j).append((char)k).append((char)l).append(m);
                            allOptions.append(password).append(" ");
                            password.setLength(0);
                        }
                    }
                }
            }
        }
        System.out.println(allOptions);
    }
}
