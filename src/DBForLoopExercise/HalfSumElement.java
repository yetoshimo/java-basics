package DBForLoopExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            numbers.add(Integer.parseInt(scan.nextLine()));
        }
        int maxNumber = Collections.max(numbers);
        int sumOthers = numbers.stream().mapToInt(Integer::intValue).sum() - maxNumber;
        if (maxNumber == sumOthers) {
            System.out.println("Yes");
            System.out.printf("Sum = %s", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %s", Math.abs(maxNumber - sumOthers));
        }
    }
}
