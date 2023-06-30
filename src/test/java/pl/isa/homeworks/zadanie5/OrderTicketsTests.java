package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTicketsTests {

    @Test
    @DisplayName("Should return zero when buy child tickets")
    void shouldReturnZeroWhenBuyChildTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(0, false);
        Person person1 = new Person(5, false);

        people.add(person);
        people.add(person1);

        assertEquals(0, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    @DisplayName("Should return 20 when buy teenager tickets")
    void shouldReturn20WhenBuyTeenagerTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(6, false);
        Person person1 = new Person(14, true);

        people.add(person);
        people.add(person1);

        assertEquals(20, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    @DisplayName("Should return 24 when buy student tickets")
    void shouldReturn24WhenBuyStudentTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(15, true);
        Person person1 = new Person(26, true);

        people.add(person);
        people.add(person1);

        assertEquals(24, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    @DisplayName("Should return 30 when buy adult tickets")
    void shouldReturn30WhenBuyAdultTickets() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(27, false);
        Person person1 = new Person(100, false);

        people.add(person);
        people.add(person1);

        assertEquals(30, OrderTickets.takeOrder(people).getTotalPrice());
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







