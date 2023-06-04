package pl.isa.homeworks.dodatkowe1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Dodatkowe1Tests {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 23, 59, 89, 97})
    public void isPrime_true(int value) {
        assertTrue(Dodatkowe1.isPrime(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, 6, 27, 58, 99, 100})
    public void isPrime_false(int value) {
        assertFalse(Dodatkowe1.isPrime(value));
    }
}
