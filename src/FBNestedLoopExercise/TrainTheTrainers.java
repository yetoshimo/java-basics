package FBNestedLoopExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfJury = Integer.parseInt(scan.nextLine());
        double gradeTotal = 0;
        double allGrades = 0;
        int numberOfGrades = 0;
        String nameOfPresentation = scan.nextLine();
        while (!nameOfPresentation.equals("Finish")) {
            for (int i = 0; i < numberOfJury; i++) {
                gradeTotal += Double.parseDouble(scan.nextLine());
            }
            allGrades += gradeTotal;
            numberOfGrades += numberOfJury;
            System.out.printf("%s - %.2f.\n", nameOfPresentation, gradeTotal / numberOfJury);
            gradeTotal = 0;
            nameOfPresentation = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGrades / numberOfGrades);
    }
}
