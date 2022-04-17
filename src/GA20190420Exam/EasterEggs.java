package GA20190420Exam;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(scan.nextLine());
        HashMap<String,Integer> allEggs = new HashMap<>(Map.of("red",0,"orange",0,"blue",0,"green",0));
        AtomicReference<Integer> maxValue = new AtomicReference<>(0);
        AtomicReference<String> maxKey = new AtomicReference<>("");
        for (int i = 0; i < numberOfEggs; i++) {
            String eggColor = scan.nextLine();
            allEggs.put(eggColor, allEggs.get(eggColor) + 1);
        }
        System.out.printf("Red eggs: %d\n", allEggs.get("red"));
        System.out.printf("Orange eggs: %d\n", allEggs.get("orange"));
        System.out.printf("Blue eggs: %d\n", allEggs.get("blue"));
        System.out.printf("Green eggs: %d\n", allEggs.get("green"));
        allEggs.forEach((key, value) -> {
            if (value > maxValue.get()) {
                maxValue.set(value);
                maxKey.set(key);
            }
        });
        System.out.printf("Max eggs: %d -> %s", Collections.max(allEggs.values()), maxKey.get());
    }
}
