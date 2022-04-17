package GB20190309Exam;

import java.util.Map;
import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        int startPoints = 301;
        boolean isWon = false;
        String typeOfHit = scan.nextLine();
        Map<String,Integer> pointTable = Map.of("Single",1,"Double",2,"Triple",3);
        int successRound = 0;
        int unsuccessfulRound = 0;
        while (!typeOfHit.equals("Retire")) {
            int hitPoints = Integer.parseInt(scan.nextLine());
            int potentialDecrement = hitPoints * pointTable.get(typeOfHit);
            if (startPoints > 100 && potentialDecrement < startPoints) {
                startPoints -= potentialDecrement;
                successRound++;
            } else if (startPoints <= 100 && potentialDecrement <= 100) {
                if (startPoints - potentialDecrement >= 0) {
                    startPoints -= potentialDecrement;
                    successRound++;
                } else {
                    unsuccessfulRound++;
                }
            }
            if (startPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successRound);
                isWon = true;
                break;
            }
            typeOfHit = scan.nextLine();
        }
        if (!isWon) {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulRound);
        }
    }
}
