package lesson9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private final Queue<Ticket> queue = new LinkedList<>();
    public TicketingSystem() {

    }
    public void addTicket(String description) {
        if(description == null || description.isEmpty())
            return;
        queue.add(new Ticket(queue.size(), description));
    }

    public Ticket processTicket() {
        if(queue.isEmpty()) {
            System.out.println("<no tickets>");
            return null;
        }
        return queue.poll();
    }

    public void viewNextTicket() {
        if(queue.isEmpty())
            System.out.println("<no tickets>");
        else
            System.out.println(queue.peek());
    }
}
