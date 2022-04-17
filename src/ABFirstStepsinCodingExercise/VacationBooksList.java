package ABFirstStepsinCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int numberOfDays = Integer.parseInt(scan.nextLine());
        System.out.println((totalPages / pagesPerHour) / numberOfDays);
    }
}
