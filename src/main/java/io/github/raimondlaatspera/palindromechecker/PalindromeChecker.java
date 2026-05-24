package io.github.raimondlaatspera.palindromechecker;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {

        if (word == null) throw new IllegalArgumentException("palindrome cannot be null");

        String cleanedWord = word.toLowerCase().trim().replaceAll("\\s", "");

        return cleanedWord.contentEquals(new StringBuilder(cleanedWord).reverse());
    }
}
