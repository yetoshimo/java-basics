package GB20190309Exam;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes = Integer.parseInt(scan.nextLine());
        int seconds = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        int speedForHundredMeters = Integer.parseInt(scan.nextLine());
        int hundredMeters = 100;
        int timeCorrectionLength = 120;
        double timeCorrectionSeconds = 2.5;
        int controlTime = minutes * 60 + seconds;
        double timeCorrection = (length / timeCorrectionLength) * timeCorrectionSeconds;
        double ownTime = ((length / hundredMeters) * speedForHundredMeters) - timeCorrection;
        if (ownTime <= controlTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", ownTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", ownTime - controlTime);
        }
    }
}
