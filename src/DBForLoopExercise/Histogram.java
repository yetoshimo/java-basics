package DBForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scan.nextLine());
        int p1, p2, p3, p4, p5;
        p1 = p2 = p3 = p4 = p5 = 0;
        for (int i = 0; i < countOfNumbers; i++) {
            int nextNumber = Integer.parseInt(scan.nextLine());
            if (nextNumber < 200) {
                p1 += 1;
            } else if (nextNumber < 400) {
                p2 += 1;
            } else if (nextNumber < 600) {
                p3 += 1;
            } else if (nextNumber < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        System.out.printf("%.2f%%\n", (double) p1 * 100 / countOfNumbers);
        System.out.printf("%.2f%%\n", (double) p2 * 100 / countOfNumbers);
        System.out.printf("%.2f%%\n", (double) p3 * 100 / countOfNumbers);
        System.out.printf("%.2f%%\n", (double) p4 * 100 / countOfNumbers);
        System.out.printf("%.2f%%", (double) p5 * 100 / countOfNumbers);
    }
}
