package DAForLoopLab;

import java.util.Scanner;

public class Numbers1toNwithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberN = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= numberN; i += 3) {
            System.out.println(i);
        }
    }
}
