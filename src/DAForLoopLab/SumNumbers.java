package DAForLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scan.nextLine());
        int totalNumbers = 0;
        for (int i = 0; i < countNumbers; i++) {
            totalNumbers += Integer.parseInt(scan.nextLine());
        }
        System.out.println(totalNumbers);
    }
}
