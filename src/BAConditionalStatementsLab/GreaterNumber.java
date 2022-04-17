package BAConditionalStatementsLab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        System.out.println(Math.max(numberOne, numberTwo));
//        if (numberOne > numberTwo) {
//            System.out.println(numberOne);
//        } else {
//            System.out.println(numberTwo);
//        }
    }
}
