package BAConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        switch (shape) {
            case "square" -> {
                double side = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", Math.pow(side, 2));
            }
            case "rectangle" -> {
                double sideOne = Double.parseDouble(scan.nextLine());
                double sideTwo = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", sideOne * sideTwo);
            }
            case "circle" -> {
                double radius = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", Math.PI * Math.pow(radius, 2));
            }
            case "triangle" -> {
                double baseLength = Double.parseDouble(scan.nextLine());
                double height = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", (baseLength * height) / 2);
            }
        }
    }
}
