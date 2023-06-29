package pl.isa.homeworks.zadanie5;

import java.util.List;

public final class OrderTickets {

    public static Order takeOrder(List<Person> people) {

        Order order = new Order();
        for (Person person : people) {
            Ticket ticket = ticketCategory(person);
            order.addTicket(ticket);
        }
        return order;
    }

    public static Ticket ticketCategory(Person person) {

        int age = person.getAge();

        if (age <= 5) {
            return new Ticket("Child", 0);
        } else if (age > 5 && age < 15) {
            return new Ticket("Teenager", 10);
        } else if (age >= 15 && age <= 26) {
            return new Ticket("Student", 12);
        } else {
            return new Ticket("Adult", 15);
        }
    }
}

