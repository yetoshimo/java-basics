package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        double litreConvert = 0.001;
        double percentConvert = 0.01;
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine()) * percentConvert;
        double volume = (length * width * height) * litreConvert;
        System.out.printf("%.2f", volume * (1 - percent));
    }
}
