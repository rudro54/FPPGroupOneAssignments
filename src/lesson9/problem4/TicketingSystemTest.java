package lesson9.problem4;

public class TicketingSystemTest {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.addTicket("Roy");
        ticketingSystem.addTicket("Zayed");
        System.out.println("Processed: " + ticketingSystem.processTicket());
        ticketingSystem.viewNextTicket();
    }
}
