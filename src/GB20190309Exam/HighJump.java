package GB20190309Exam;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int desiredHeight = Integer.parseInt(scan.nextLine());
        int currentTarget = desiredHeight - 30;
        int failedCount = 0;
        int jumpCount = 0;
        int currentJump;
        currentJump = Integer.parseInt(scan.nextLine());
        boolean isFailed = false;
        while (true) {
            jumpCount++;
            if (currentJump > currentTarget) {
                if (currentTarget >= desiredHeight) {
                    break;
                }
                currentTarget += 5;
                failedCount = 0;
            } else {
                failedCount++;
                if (failedCount == 3) {
                    isFailed = true;
                    break;
                }
            }
            currentJump = Integer.parseInt(scan.nextLine());
        }
        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desiredHeight, jumpCount);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentTarget, jumpCount);
        }
    }
}
