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
                String title = scanner.nextLine().trim();
                if (title.isEmpty()) {
                    System.out.println("Ticket title cannot be blank.");
                    continue;
                }
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
            } else if (choice.equals("3")) {
                System.out.print("Enter ticket ID to resolve: ");
                try {
                    String idInput = scanner.nextLine();
                    int targetId = Integer.parseInt(idInput);
                    if (targetId <= 0) {
                        System.out.println("Ticket ID must be greater than zero.");
                        continue;
                    }
                    boolean found = false;
                    for (Ticket ticket : tickets) {
                        if (targetId == ticket.getId()) {
                            found = true;
                            ticket.resolve();
                            System.out.println(ticket.getId() + " - " + ticket.getTitle() + " - " + ticket.getStatus());
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Ticket not found.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid whole-number ticket ID.");
                }
            } else {
                System.out.println("Invalid choice. Please enter 0, 1, 2, or 3.");
            }
        }   
        scanner.close();
    }
}
