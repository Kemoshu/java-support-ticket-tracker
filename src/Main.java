import java.util.Scanner;
public class Main {
    public static void main(String[] args) {    
        Ticket ticket = new Ticket(101, "Printer offline");
        System.out.println(ticket.getId());
        System.out.println(ticket.getTitle());
        System.out.println(ticket.getStatus());
        Scanner scanner = new Scanner(System.in);    
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
            } else {
                System.out.println("You selected: " + choice);
            }
        }   
        scanner.close();
    }
}
