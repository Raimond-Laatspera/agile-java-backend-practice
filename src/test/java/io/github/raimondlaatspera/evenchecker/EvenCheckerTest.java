package io.github.raimondlaatspera.evenchecker;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EvenCheckerTest {

    @Test
    void shouldReturnTrueForEvenNumbers() {
        EvenChecker checker = new EvenChecker();

        assertTrue(checker.isEven(4));
    }

    @Test
    void shouldReturnFalseForOddNumbers() {
        EvenChecker checker = new EvenChecker();

        assertFalse(checker.isEven(5));
    }

    @Test
    void shouldHandleZeroAsEven() {
        EvenChecker checker = new EvenChecker();

        assertTrue(checker.isEven(0));
    }
}