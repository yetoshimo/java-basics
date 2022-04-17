package EBWhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookToSearch = scan.nextLine();
        String nextBook = scan.nextLine();
        int bookCounter = 0;
        boolean is_found = false;
        while (!nextBook.equals("No More Books")) {
            if (nextBook.equals(bookToSearch)) {
                is_found = true;
                break;
            }
            nextBook = scan.nextLine();
            bookCounter += 1;
        }
        if (is_found) {
            System.out.printf("You checked %s books and found it.", bookCounter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %s books.", bookCounter);
        }
    }
}
