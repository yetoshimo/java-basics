package EAWhileLoopLab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int depth = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int availableVolume = width * depth * height;
        int usedSpace = 0;
        String boxVolume = scan.nextLine();
        while (!boxVolume.equals("Done")) {
            usedSpace += Integer.parseInt(boxVolume);
            if (usedSpace <= availableVolume) {
                boxVolume = scan.nextLine();
            } else {
                break;
            }
        }
        if (usedSpace <= availableVolume) {
            System.out.printf("%s Cubic meters left.", availableVolume - usedSpace);
        } else {
            System.out.printf("No more free space! You need %s Cubic meters more.", usedSpace - availableVolume);
        }
    }
}
