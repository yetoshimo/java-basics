package GB20190309Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> matchResults = new ArrayList<>();
        String firstMatch = scan.nextLine();
        matchResults.add(firstMatch);
        String secondMatch = scan.nextLine();
        matchResults.add(secondMatch);
        String thirdMatch = scan.nextLine();
        matchResults.add(thirdMatch);
        int teamWon = 0;
        int teamLost = 0;
        int draw = 0;
        for (int i = 0; i < matchResults.size(); i++) {
            int ownResult = Integer.parseInt(matchResults.get(i).split(":")[0]);
            int awayResult = Integer.parseInt(matchResults.get(i).split(":")[1]);
            if (ownResult > awayResult) {
                teamWon++;
            } else if (awayResult > ownResult) {
                teamLost++;
            } else {
                draw++;
            }
        }
        System.out.printf("Team won %d games.\n", teamWon);
        System.out.printf("Team lost %d games.\n", teamLost);
        System.out.printf("Drawn games: %d", draw);
    }
}
