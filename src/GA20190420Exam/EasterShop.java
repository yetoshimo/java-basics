package GA20190420Exam;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(scan.nextLine());
        int deltaEggs;
        int eggsSold = 0;
        boolean outOfEggs = false;
        String nextCommand = scan.nextLine();
        while (!nextCommand.equals("Close")) {
            deltaEggs = Integer.parseInt(scan.nextLine());
            if (nextCommand.equals("Buy")) {
                if (numberOfEggs >= deltaEggs) {
                    numberOfEggs -= deltaEggs;
                    eggsSold += deltaEggs;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", numberOfEggs);
                    outOfEggs = true;
                    break;
                }
            } else {
                numberOfEggs += deltaEggs;
            }
            nextCommand = scan.nextLine();
        }
        if (!outOfEggs) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }
    }
}
