package AAFirstStepsinCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        int hours_needed = 3;
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        System.out.printf("The architect %s will need %s hours to complete %s project/s.", name, projects * hours_needed, projects);
    }
}
