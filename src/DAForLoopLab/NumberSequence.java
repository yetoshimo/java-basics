package DAForLoopLab;

import java.util.*;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scan.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < countNumbers; i++) {
            numbers.add(Integer.parseInt(scan.nextLine()));
        }
        System.out.printf("Max number: %s\n", Collections.max(numbers));
        System.out.printf("Min number: %s", Collections.min(numbers));
    }
}
