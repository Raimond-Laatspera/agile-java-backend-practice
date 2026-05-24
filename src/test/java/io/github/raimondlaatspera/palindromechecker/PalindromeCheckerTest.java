package io.github.raimondlaatspera.palindromechecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    void shouldReturnTrueForValidPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("abba"));
    }

    @Test
    void shouldReturnFalseForInvalidPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertFalse(palindromeChecker.isPalindrome("hello"));
    }

    @Test
    void shouldIgnoreCapitalization() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("Abba"));
    }

    @Test
    void shouldIgnoreAllWhitespaceCharacters() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertTrue(palindromeChecker.isPalindrome("     rats   live on no evil star   "));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        assertThrows(IllegalArgumentException.class, () -> palindromeChecker.isPalindrome(null));
    }
}
