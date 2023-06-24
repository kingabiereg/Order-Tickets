package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OrderTicketsTests {

    @Test
    void addTicketByName() {
        Ticket ticket = new Ticket("Child", 0);
        assertEquals("Child", ticket.getName());
    }

    @Test
    void addTicketByPrice() {
        Ticket ticket = new Ticket("Child", 0);
        assertEquals(0, ticket.getPrice());
    }

    @Test
    void getTotalPrice() {

        Order orderTicket = new Order();
        Ticket ticket = new Ticket("Child", 0);
        Ticket ticket2 = new Ticket("Adult", 15);
        Ticket ticket3 = new Ticket("Student", 12);

        orderTicket.addTicket(ticket);
        orderTicket.addTicket(ticket2);
        orderTicket.addTicket(ticket3);

        assertEquals(27, orderTicket.getTotalPrice());
    }

    @Test
    void getAged() {
        Person person = new Person(28, false);
        assertEquals(28, person.getAge());
    }

    @Test
    void isLearning() {
        Person person = new Person(4, false);
        assertFalse(person.isLearning());
    }
}

