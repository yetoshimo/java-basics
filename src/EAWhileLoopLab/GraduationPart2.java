package EAWhileLoopLab;

import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
        double grade;
        double averageGrade = 0.0;
        int educationDuration = 12;
        int currentYear = 1;
        while (currentYear <= educationDuration) {
            grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                averageGrade += grade;
            } else {
                System.out.printf("%s has been excluded at %s grade", studentName, currentYear);
                break;
            }
            currentYear += 1;
        }
        if (currentYear > 12) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade / educationDuration);
        }
    }
}
