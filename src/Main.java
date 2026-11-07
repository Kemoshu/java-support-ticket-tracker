import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {    
        ArrayList<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);    
        int nextId = 1;
        while (true) {
            System.out.println("===== Support Ticket Tracker =====");
            System.out.println("1. Create Ticket");
            System.out.println("2. List Tickets");
            System.out.println("3. Resolve Ticket");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                System.out.println("Goodbye!");
                break;
            } else if (choice.equals("1")) {
                System.out.print("Enter a Ticket Title: ");
                String title = scanner.nextLine();
                Ticket ticket = new Ticket(nextId, title);
                tickets.add(ticket);
                System.out.println("Ticket created: " + ticket.getId() + " - " + ticket.getTitle());
                nextId++;
            } else if (choice.equals("2")) {
                if (tickets.isEmpty()) {
                    System.out.println("No tickets found.");
                } else {
                  System.out.println("Tickets available: " + tickets.size());  
                  for (Ticket ticket : tickets) {
                        System.out.println(ticket.getId() + " - " + ticket.getTitle() + " - " + ticket.getStatus());
                  }
                }
            } else {
                System.out.println("You selected: " + choice);
            }
        }   
        scanner.close();
    }
}
