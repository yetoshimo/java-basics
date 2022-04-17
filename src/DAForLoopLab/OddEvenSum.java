package DAForLoopLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scan.nextLine());
        List<Integer> oddIdxNumbers = new ArrayList<>();
        List<Integer> evenIdxNumbers = new ArrayList<>();
        for (int i = 0; i < countNumbers; i++) {
            if (i % 2 ==0) {
                evenIdxNumbers.add(Integer.parseInt(scan.nextLine()));
            } else {
                oddIdxNumbers.add(Integer.parseInt(scan.nextLine()));
            }
        }
        int sumOdds = oddIdxNumbers.stream().mapToInt(Integer::intValue).sum();
        int sumEvens = evenIdxNumbers.stream().mapToInt(Integer::intValue).sum();
        if (sumOdds == sumEvens) {
            System.out.println("Yes");
            System.out.printf("Sum = %s", sumOdds);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %s", Math.abs(sumEvens - sumOdds));
        }
    }
}
