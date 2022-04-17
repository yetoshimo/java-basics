package DAForLoopLab;

import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberN = Integer.parseInt(scan.nextLine());
        for (int i = numberN; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
