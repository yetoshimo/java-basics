package EBWhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int failedGrades = Integer.parseInt(scan.nextLine());
        int numberOfFails = failedGrades;
        int receivedGrade;
        int successLimit = 4;
        int numberOfProblems = 0;
        String lastProblem = "";
        boolean isFailed = false;
        double averageGrade = 0.0;
        String nameOfTask = scan.nextLine();
        while (!nameOfTask.equals("Enough")) {
            receivedGrade = Integer.parseInt(scan.nextLine());
            numberOfProblems += 1;
            if (receivedGrade <= successLimit) {
                failedGrades -= 1;
            }
            if (failedGrades < 1) {
                isFailed = true;
                break;
            }
            averageGrade += receivedGrade;
            lastProblem = nameOfTask;
            nameOfTask = scan.nextLine();
        }
        if (!isFailed) {
            System.out.printf("Average score: %.2f\n", averageGrade / numberOfProblems);
            System.out.printf("Number of problems: %s\n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %s poor grades.", numberOfFails);
        }
    }
}
