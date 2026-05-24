package io.github.raimondlaatspera.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizzIfOnlyDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.compute(21));
    }

    @Test
    void shouldReturnBuzzIfOnlyDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.compute(25));
    }

    @Test
    void shouldReturnFizzBuzzIfDivisibleByFifteen() {
        assertEquals("FizzBuzz", FizzBuzz.compute(30));
    }

    @Test
    void shouldReturnNumberIfNoCriteriaMet() {
        assertEquals("2", FizzBuzz.compute(2));
    }
}
