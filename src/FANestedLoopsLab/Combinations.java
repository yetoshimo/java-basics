package FANestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetNumber = Integer.parseInt(scan.nextLine());
        int counter = 0;
        for (int i = 0; i <= targetNumber; i++) {
            for (int j = 0; j <= targetNumber; j++) {
                for (int k = 0; k <= targetNumber; k++) {
                    if (i + j + k == targetNumber) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
