package CAConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
