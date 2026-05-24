package io.github.raimondlaatspera.palindromechecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {

    @Test
    void shouldReturnTrueForValidPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("abba"));
    }

    @Test
    void shouldIgnoreCapitalization() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("Abba"));
    }

    @Test
    void shouldIgnoreWhitespace() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("     rats   live on no evil star   "));
    }
}
