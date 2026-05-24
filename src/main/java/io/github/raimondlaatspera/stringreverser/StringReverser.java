package io.github.raimondlaatspera.stringreverser;

public class StringReverser {
    public String reverseString(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        return new StringBuilder(text).reverse().toString();
    }
}
