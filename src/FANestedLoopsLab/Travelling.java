package FANestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        double savedMoney = 0.0;
        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scan.nextLine());
            while (savedMoney < neededMoney) {
                savedMoney += Double.parseDouble(scan.nextLine());
            }
            System.out.printf("Going to %s!\n", destination);
            savedMoney = 0.0;
            destination = scan.nextLine();
        }
    }
}
