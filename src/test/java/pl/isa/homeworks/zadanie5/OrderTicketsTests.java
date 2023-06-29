package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTicketsTests {

    @Test
    void getTotalPriceWhenBuyChildAndAdultTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(2, false);
        Person person1 = new Person(32, false);

        people.add(person);
        people.add(person1);

        assertEquals(15, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void getTotalPriceWhenBuyManyDifferentTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(0, false);
        Person person1 = new Person(100, false);
        Person person2 = new Person(14, true);
        Person person3 = new Person(16, true);
        Person person4 = new Person(26, true);
        Person person5 = new Person(27, true);

        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        assertEquals(64, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void getTotalPriceWhenChildBuysTicket() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(0, false);
        Person person1 = new Person(5, false);

        people.add(person);
        people.add(person1);

        assertEquals(0, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void getTotalPriceWhenPeopleAreLearning() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(15, true);
        Person person1 = new Person(26, true);

        people.add(person);
        people.add(person1);

        assertEquals(24, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void getTotalPriceWhenBuyStudentAndAdultTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(26, true);
        Person person1 = new Person(27, false);

        people.add(person);
        people.add(person1);

        assertEquals(27, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void getPriceOfTicketsWhenPersonIsLearning() {

        List<Person> students = new ArrayList<>();

        Person student = new Person(26, true);
        Person student1 = new Person(14, true);

        Ticket ticket = OrderTickets.ticketCategory(student);
        Ticket ticket1 = OrderTickets.ticketCategory(student1);

        students.add(student);
        students.add(student1);

        assertEquals(12, ticket.getPrice());
        assertEquals(10, ticket1.getPrice());
    }

    @Test
    void getNamesOfTicketsWhenBuyChildAndAdultTickets() {

        Person child = new Person(0, false);
        Person adult = new Person(32, false);

        Ticket ticket = OrderTickets.ticketCategory(child);
        Ticket ticket1 = OrderTickets.ticketCategory(adult);

        assertEquals("Child", ticket.getName());
        assertEquals("Adult", ticket1.getName());

    }
}







