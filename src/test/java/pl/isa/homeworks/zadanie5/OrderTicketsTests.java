package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTicketsTests {

    @Test
    void addTicketByName() {

        Ticket ticket = new Ticket("child", 0);
        assertEquals("child", ticket.getName());
    }

    @Test
    void addTicketByPrice() {
        Ticket ticket = new Ticket("child", 0);
        assertEquals(0, ticket.getPrice());
    }
}

