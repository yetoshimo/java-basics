package GA20190420Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfBread = Integer.parseInt(scan.nextLine());
        double packetOfSugar = 950;
        double packetOfFlour = 750;
        ArrayList<Integer> sugar = new ArrayList<>();
        ArrayList<Integer> flour = new ArrayList<>();
        for (int i = 0; i < numberOfBread; i++) {
            sugar.add(Integer.parseInt(scan.nextLine()));
            flour.add(Integer.parseInt(scan.nextLine()));
        }
        double usedSugar = Math.ceil(sugar.stream().mapToInt(Integer::intValue).sum() / packetOfSugar);
        double usedFlour = Math.ceil(flour.stream().mapToInt(Integer::intValue).sum() / packetOfFlour);
        System.out.printf("Sugar: %.0f\n", usedSugar);
        System.out.printf("Flour: %.0f\n", usedFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", Collections.max(flour), Collections.max(sugar));
    }
}
