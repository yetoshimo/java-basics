package GB20190309Exam;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nextCommand = scan.nextLine();
        int winCount = 0;
        int lostCount = 0;
        int totalCount = 0;
        while (!nextCommand.equals("End of tournaments")) {
            int numberOfMatches = Integer.parseInt(scan.nextLine());
            for (int i = 1; i <= numberOfMatches; i++) {
                totalCount++;
                int ownScore = Integer.parseInt(scan.nextLine());
                int awayScore = Integer.parseInt(scan.nextLine());
                if (ownScore > awayScore) {
                    winCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, nextCommand, ownScore - awayScore);
                } else {
                    lostCount++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, nextCommand, awayScore - ownScore);
                }
            }
            nextCommand = scan.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", ((double) winCount / totalCount) * 100);
        System.out.printf("%.2f%% matches lost\n", ((double) lostCount / totalCount) * 100);
    }
}
