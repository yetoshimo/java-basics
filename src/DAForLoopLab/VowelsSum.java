package DAForLoopLab;

import java.util.Map;
import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character,Integer> vowels = Map.of('a',1,'e',2,'i',3,'o',4,'u',5);
        int totalVowels = 0;
        String inputString = scan.nextLine();
        char[] chars = inputString.toCharArray();
        for (char ch: chars) {
            if (vowels.containsKey(ch)) {
                totalVowels += vowels.get(ch);
            }
        }
        System.out.println(totalVowels);
    }
}
