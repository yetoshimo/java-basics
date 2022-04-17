package GB20190309Exam;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstPlayer = scan.nextLine();
        String secondPlayer = scan.nextLine();
        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        int firstCard;
        int secondCard;
        String nextCard;
        boolean isWar = false;
        while (true) {
            nextCard = scan.nextLine();
            if (nextCard.equals("End of game")) {
                break;
            }
            firstCard = Integer.parseInt(nextCard);
            nextCard = scan.nextLine();
            secondCard = Integer.parseInt(nextCard);
            if (firstCard > secondCard) {
                firstPlayerPoints += firstCard - secondCard;
            } else if (secondCard > firstCard) {
                secondPlayerPoints += secondCard - firstCard;
            } else {
                System.out.println("Number wars!");
                nextCard = scan.nextLine();
                firstCard = Integer.parseInt(nextCard);
                nextCard = scan.nextLine();
                secondCard = Integer.parseInt(nextCard);
                if (firstCard > secondCard) {
                    System.out.printf("%s is winner with %d points", firstPlayer, firstPlayerPoints);
                } else {
                    System.out.printf("%s is winner with %d points", secondPlayer, secondPlayerPoints);
                }
                isWar = true;
                break;
            }
        }
        if (!isWar) {
            System.out.printf("%s has %d points\n", firstPlayer, firstPlayerPoints);
            System.out.printf("%s has %d points", secondPlayer, secondPlayerPoints);
        }
    }
}
