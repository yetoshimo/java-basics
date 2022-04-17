package BAConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        String secretPassword = "s3cr3t!P@ssw0rd";
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        if (password.equals(secretPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
