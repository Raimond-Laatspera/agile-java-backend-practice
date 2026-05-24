package io.github.raimondlaatspera.palindromechecker;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        String cleanedWord = word.toLowerCase().trim().replaceAll("\\s", "");

        return cleanedWord.contentEquals(new StringBuilder(cleanedWord).reverse());
    }
}
