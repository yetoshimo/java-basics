package BBConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalTime = 0;
        for (int i=0; i < 3; i++) {
            totalTime += Integer.parseInt(scan.nextLine());
        }
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        System.out.printf("%s:%02d", minutes, seconds);
    }
}
