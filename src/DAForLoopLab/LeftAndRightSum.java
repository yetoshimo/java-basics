package DAForLoopLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfNumbers = 2 * Integer.parseInt(scan.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < countOfNumbers; i++) {
            numbers.add(Integer.parseInt(scan.nextLine()));
        }
        List<Integer> firstHalfList = numbers.subList(0, countOfNumbers / 2);
        List<Integer> secondHalfList = numbers.subList(countOfNumbers / 2, countOfNumbers);
        int sumFirstHalf = firstHalfList.stream().mapToInt(Integer::intValue).sum();
        int sumSecondHalf = secondHalfList.stream().mapToInt(Integer::intValue).sum();
        if (sumFirstHalf == sumSecondHalf) {
            System.out.printf("Yes, sum = %s", sumFirstHalf);
        } else {
            System.out.printf("No, diff = %s", Math.abs(sumFirstHalf - sumSecondHalf));
        }
    }
}
