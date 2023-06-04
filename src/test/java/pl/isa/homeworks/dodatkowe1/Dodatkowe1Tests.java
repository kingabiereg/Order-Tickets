package pl.isa.homeworks.dodatkowe1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;
import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("provideCountCharactersArguments")
    public void countCharacters_equalsMap(String value, Map<String, Integer> expected) {
        assertTrue(Dodatkowe1.countCharacters(value).equals(expected));
    }

    private static Stream<Arguments> provideCountCharactersArguments() {
        return Stream.of(
                Arguments.of("abc", Map.of("a", 1, "b", 1, "c", 1)),
                Arguments.of("ananas", Map.of("a", 3, "n", 2, "s", 1)),
                Arguments.of("Ala ma kota", Map.of("a", 4, "l", 1, "m", 1, "k", 1, "o", 1, "t", 1))
        );
    }
}
