package GB20190309Exam;

import java.util.Map;
import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(scan.nextLine());
        int rankingPoints = Integer.parseInt(scan.nextLine());
        Map<String,Integer> pointsList = Map.of("W",2000,"F",1200,"SF",720);
        int totalPoints = 0;
        int wonRounds = 0;
        for (int i = 0; i < numberOfTournaments; i++) {
            String tournamentLeg = scan.nextLine();
            if (tournamentLeg.equals("W")) {
                wonRounds++;
            }
            totalPoints += pointsList.get(tournamentLeg);
        }
        System.out.printf("Final points: %d\n", totalPoints + rankingPoints);
        System.out.printf("Average points: %.0f\n", Math.floor((double) totalPoints / numberOfTournaments));
        System.out.printf("%.2f%%", ((double) wonRounds / numberOfTournaments) * 100);
    }
}
