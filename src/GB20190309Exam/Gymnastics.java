package GB20190309Exam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String instrument = scan.nextLine();
        int maxPoints = 20;
        int percent = 100;
        double totalPoints;
        Map<String, List<Double>> russia = Map.of("ribbon",List.of(9.1,9.4),
                "hoop",List.of(9.3,9.8),
                "rope",List.of(9.6,9.0));
        Map<String, List<Double>> bulgaria = Map.of("ribbon",List.of(9.6,9.4),
                "hoop",List.of(9.55,9.75),
                "rope",List.of(9.5,9.4));
        Map<String, List<Double>> italy = Map.of("ribbon",List.of(9.2,9.5),
                "hoop",List.of(9.45,9.35),
                "rope",List.of(9.7,9.15));
        if (country.equals("Russia")) {
            totalPoints = russia.get(instrument).stream().mapToDouble(Double::doubleValue).sum();
        } else if (country.equals("Bulgaria")) {
            totalPoints = bulgaria.get(instrument).stream().mapToDouble(Double::doubleValue).sum();
        } else {
            totalPoints = italy.get(instrument).stream().mapToDouble(Double::doubleValue).sum();
        }
        System.out.printf("The team of %s get %.3f on %s.\n", country, totalPoints, instrument);
        System.out.printf("%.2f%%", ((maxPoints - totalPoints) / maxPoints) * percent);
    }
}
