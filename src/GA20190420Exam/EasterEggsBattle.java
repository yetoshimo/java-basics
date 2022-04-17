package GA20190420Exam;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scan.nextLine());
        int secondPlayer = Integer.parseInt(scan.nextLine());
        String nextRound = scan.nextLine();
        while (!nextRound.equals("End of battle")) {
            if (nextRound.equals("one")) {
                secondPlayer--;
            } else {
                firstPlayer--;
            }
            if (firstPlayer > 0 && secondPlayer > 0) {
                nextRound = scan.nextLine();
            } else {
                break;
            }
        }
        if (nextRound.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.\n", firstPlayer);
            System.out.printf("Player two has %d eggs left.", secondPlayer);
        } else if (firstPlayer > 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayer);
        } else {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayer);
        }
    }
}
