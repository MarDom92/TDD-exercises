package FizzBuzzTest;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void createFizzBuzz() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 52, 68})
    public void shouldCheckAndReturnIndivisibleNumbers(int expectedNumber) {

        String result = fizzBuzz.check(expectedNumber);
        String expected = String.valueOf(expectedNumber);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 99})
    public void shouldCheckMultipleOfThreeAndReturnFizz(int expectedNumber) {

        String result = fizzBuzz.check(3);

        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 40, 70})
    public void shouldCheckMultipleOfFiveAndReturnBuzz(int expectedNumber) {

        String result = fizzBuzz.check(5);

        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75})
    public void shouldCheckMultiipleOfThreeAndFiveAndReturnFizzBuzz(int expectedNumber) {

        String result = fizzBuzz.check(30);

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldCheckZeroAndThrowsIllegalArgumentException() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    fizzBuzz.check(0);
                });
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4, -5, -6, -9, -10, -15, -30})
    public void shouldCheckNegativeNumbersAndThrowsIllegalArgumentException(int expectedNumber) {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    fizzBuzz.check(expectedNumber);
                });
    }
}

