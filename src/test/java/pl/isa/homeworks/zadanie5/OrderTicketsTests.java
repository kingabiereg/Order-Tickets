package pl.isa.homeworks.zadanie5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTicketsTests {

    @Test
    void takeOrder1() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(2, false);
        Person person1 = new Person(32, false);

        people.add(person);
        people.add(person1);

        assertEquals(15, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void takeOrder2() {

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
    void takeOrder3() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(0, false);
        Person person1 = new Person(5, false);

        people.add(person);
        people.add(person1);

        assertEquals(0, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void takeOrder4() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(15, true);
        Person person1 = new Person(26, true);

        people.add(person);
        people.add(person1);

        assertEquals(24, OrderTickets.takeOrder(people).getTotalPrice());
    }

    @Test
    void takeOrder5() {

        List<Person> people = new ArrayList<>();

        Person person = new Person(26, true);
        Person person1 = new Person(27, false);

        people.add(person);
        people.add(person1);

        assertEquals(27, OrderTickets.takeOrder(people).getTotalPrice());
    }

}







