package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        double convert = 1.79549;
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        System.out.println(usd * convert);
    }
}
