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

    @ParameterizedTest
    @ValueSource(ints = {11, 101, 1001, 1221, 12321, 13231, 1592951, 895598})
    public void isPalindrome_true(int value) {
        assertTrue(Dodatkowe1.isPalindrome(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 110, 1010, 1122, 13321, 13221, 1492951, 865598})
    public void isPalindrome_false(int value) {
        assertFalse(Dodatkowe1.isPalindrome(value));
    }


}
