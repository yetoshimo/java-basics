package DAForLoopLab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        char[] chars = inputString.toCharArray();
        for (char ch: chars) {
            System.out.println(ch);
        }
    }
}
