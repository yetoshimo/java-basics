package GA20190420Exam;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfBreads = Integer.parseInt(scan.nextLine());
        int maxPoints = 0;
        String maxChef = "";
        for (int i = 0; i < numberOfBreads; i++) {
            String nameOfChef = scan.nextLine();
            int chefPoints = 0;
            String points = scan.nextLine();
            while (!points.equals("Stop")) {
                chefPoints += Integer.parseInt(points);
                points = scan.nextLine();
            }
            System.out.printf("%s has %d points.\n", nameOfChef, chefPoints);
            if (chefPoints > maxPoints) {
                maxChef = nameOfChef;
                maxPoints = chefPoints;
                System.out.printf("%s is the new number 1!\n", nameOfChef);
            }
        }
        System.out.printf("%s won competition with %d points!", maxChef, maxPoints);
    }
}
