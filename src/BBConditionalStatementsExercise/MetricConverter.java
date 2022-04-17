package BBConditionalStatementsExercise;

import java.util.Map;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        Map<String,Integer> meterConverter = Map.of("mm",1000,"cm",100);
        Map<String,Double> centimeterConverter = Map.of("m",0.01,"mm",10.0);
        Map<String,Double> millimeterConverter = Map.of("m",0.001,"cm",0.1);
        String fromUnit = scan.nextLine();
        String toUnit = scan.nextLine();
        if (fromUnit.equals("m")) {
            System.out.printf("%.3f", length * meterConverter.get(toUnit));
        } else if (fromUnit.equals("cm")) {
            System.out.printf("%.3f", length * centimeterConverter.get(toUnit));
        } else {
            System.out.printf("%.3f", length * millimeterConverter.get(toUnit));
        }
    }
}
