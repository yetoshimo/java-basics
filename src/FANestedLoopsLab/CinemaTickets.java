package FANestedLoopsLab;

import java.util.HashMap;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfMovie = scan.nextLine();
        HashMap<String,Integer> ticketsSold = new HashMap<>();
        ticketsSold.put("standard", 0);
        ticketsSold.put("student", 0);
        ticketsSold.put("kid", 0);
        while (!nameOfMovie.equals("Finish")) {
            int totalSpace = Integer.parseInt(scan.nextLine());
            int soldTickets = 0;
            String ticketType = "";
            while (soldTickets < totalSpace && !ticketType.equals("End")) {
                ticketType = scan.nextLine();
                if (ticketsSold.containsKey(ticketType)) {
                    ticketsSold.put(ticketType, ticketsSold.get(ticketType) + 1);
                    soldTickets++;
                }
            }
            System.out.printf("%s - %.2f%% full.\n", nameOfMovie, (soldTickets * 100) / (double) totalSpace);
            nameOfMovie = scan.nextLine();
        }
        int totalTicketsSold = ticketsSold.values().stream().mapToInt(Integer::intValue).sum();
        System.out.printf("Total tickets: %d\n", totalTicketsSold);
        System.out.printf("%.2f%% student tickets.\n", (ticketsSold.get("student") * 100) / (double) totalTicketsSold);
        System.out.printf("%.2f%% standard tickets.\n", (ticketsSold.get("standard") * 100) / (double) totalTicketsSold);
        System.out.printf("%.2f%% kids tickets.", (ticketsSold.get("kid") * 100) / (double) totalTicketsSold);
    }
}
