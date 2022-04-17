package EBWhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        int targetSteps = 10000;
        Scanner scan = new Scanner(System.in);
        int totalSteps = 0;
        while (totalSteps < targetSteps) {
            String nextCommand = scan.nextLine();
            if (!nextCommand.equals("Going home")) {
                totalSteps += Integer.parseInt(nextCommand);
            } else {
                nextCommand = scan.nextLine();
                totalSteps += Integer.parseInt(nextCommand);
                break;
            }
        }
        if (totalSteps >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%s steps over the goal!", totalSteps - targetSteps);
        } else {
            System.out.printf("%s more steps to reach goal.", targetSteps - totalSteps);
        }
    }
}
