package pl.isa.homeworks.zadanie5;

import java.util.List;

public class
Order {

    private List<Ticket> tickets;

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Ticket ticket : tickets) {
            totalPrice = totalPrice + ticket.getPrice();
        }
        return totalPrice;
    }
}
