package DAForLoopLab;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberN = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= numberN; i++) {
            if (i % 2 == 0) {
                System.out.println((int)Math.pow(2, i));
            }
        }
    }
}
