package HA20210814Exam;

import java.util.Scanner;

public class substitute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beginFirstNumberFirstDigit = Integer.parseInt(scan.nextLine());
        int firstNumberMax = 8;
        int beginFirstNumberSecondDigit = Integer.parseInt(scan.nextLine());
        int secondNumberMax = 9;
        int beginSecondNumberFirstDigit = Integer.parseInt(scan.nextLine());
        int beginSecondNumberSecondDigit = Integer.parseInt(scan.nextLine());
        int numberOfSubstitutions = 0;
        int round = 0;
        substitutions:
        while (round < 1) {
            round++;
            for (int k = beginFirstNumberFirstDigit; k <= firstNumberMax; k++) {
                for (int l = secondNumberMax; l >= beginFirstNumberSecondDigit; l--) {
                    String firstNumberString = "";
                    firstNumberString += k;
                    firstNumberString += l;
                    if (k % 2 == 0 && l % 2 != 0) {
                        int firstNumber = Integer.parseInt(firstNumberString);
                        for (int m = beginSecondNumberFirstDigit; m <= firstNumberMax; m++) {
                            for (int n = secondNumberMax; n >= beginSecondNumberSecondDigit; n--) {
                                String secondNumberString = "";
                                secondNumberString += m;
                                secondNumberString += n;
                                if (m % 2 == 0 && n % 2 != 0) {
                                    int secondNumber = Integer.parseInt(secondNumberString);
                                    if (firstNumber != secondNumber) {
                                        System.out.printf("%d%d - %d%d\n", k, l, m, n);
                                        numberOfSubstitutions++;
                                        if (numberOfSubstitutions == 6) {
                                            break substitutions;
                                        }
                                    } else {
                                        System.out.print("Cannot change the same player.\n");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
