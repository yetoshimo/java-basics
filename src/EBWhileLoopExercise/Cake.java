package EBWhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int numberOfPieces = width * length;
        String nextCommand = scan.nextLine();
        while (!nextCommand.equals("STOP") && numberOfPieces > 0) {
            numberOfPieces -= Integer.parseInt(nextCommand);
            if (numberOfPieces > 0) {
                nextCommand = scan.nextLine();
            }
        }
        if (numberOfPieces > 0) {
            System.out.printf("%s pieces are left.", numberOfPieces);
        } else {
            System.out.printf("No more cake left! You need %s pieces more.", Math.abs(numberOfPieces));
        }
    }
}
