package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTicketsTests {

    @Test
    void takeOrder() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(2, false);
        Person person1 = new Person(32, false);

        people.add(person);
        people.add(person1);

        assertEquals(15, OrderTickets.takeOrder(people).getTotalPrice());
    }
}







