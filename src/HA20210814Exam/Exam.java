package HA20210814Exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double totalGrade = 0;
        double topStudents = 0;
        double goodStudents = 0;
        double averageStudents = 0;
        double failedStudents = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            totalGrade += grade;
            if (grade >= 5) {
                topStudents++;
            } else if (grade >= 4) {
                goodStudents++;
            } else if (grade >= 3) {
                averageStudents++;
            } else {
                failedStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", (topStudents / numberOfStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (goodStudents / numberOfStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", (averageStudents / numberOfStudents) * 100);
        System.out.printf("Fail: %.2f%%\n", (failedStudents / numberOfStudents) * 100);
        System.out.printf("Average: %.2f", (totalGrade / numberOfStudents));
    }
}
