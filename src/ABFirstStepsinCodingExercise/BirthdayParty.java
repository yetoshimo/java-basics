package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent = Integer.parseInt(scan.nextLine());
        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animator = rent / 3.0;
        System.out.println(rent + cakePrice + drinksPrice + animator);
    }
}
