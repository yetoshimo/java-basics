package AAFirstStepsinCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        double dogFood = 2.5;
        double animalFood = 4;
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double endPrice = dogs * dogFood + animals * animalFood;
        System.out.println(endPrice + " lv.");
    }
}
