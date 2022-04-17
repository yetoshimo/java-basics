package GB20190309Exam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStations = Integer.parseInt(scan.nextLine());
        Map<String,Integer> stationWorkout = new java.util.HashMap<>(Map.of("Back", 0, "Chest", 0, "Legs", 0, "Abs", 0, "Protein shake", 0, "Protein bar", 0));
        List<String> workouts = List.of("Back", "Chest", "Legs", "Abs");
        int workoutCount = 0;
        int proteinCount = 0;
        for (int i = 0; i < numberOfStations; i++) {
            String nextStation = scan.nextLine();
            stationWorkout.put(nextStation, stationWorkout.get(nextStation) + 1);
            if (workouts.contains(nextStation)) {
                workoutCount++;
            } else {
                proteinCount++;
            }
        }
        System.out.printf("%d - back\n", stationWorkout.get("Back"));
        System.out.printf("%d - chest\n", stationWorkout.get("Chest"));
        System.out.printf("%d - legs\n", stationWorkout.get("Legs"));
        System.out.printf("%d - abs\n", stationWorkout.get("Abs"));
        System.out.printf("%d - protein shake\n", stationWorkout.get("Protein shake"));
        System.out.printf("%d - protein bar\n", stationWorkout.get("Protein bar"));
        System.out.printf("%.2f%% - work out\n", ((double) workoutCount / numberOfStations) * 100);
        System.out.printf("%.2f%% - protein", ((double) proteinCount / numberOfStations) * 100);
    }
}
