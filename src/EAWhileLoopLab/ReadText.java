package EAWhileLoopLab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String newLineEntry = scan.nextLine();
        while (!newLineEntry.equals("Stop")) {
            System.out.println(newLineEntry);
            newLineEntry = scan.nextLine();
        }
    }
}
