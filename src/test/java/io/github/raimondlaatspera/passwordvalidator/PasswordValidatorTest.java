package io.github.raimondlaatspera.passwordvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void shouldBeInvalidWhenPasswordIsTooShort() {
        assertFalse(PasswordValidator.isValidPassword("abcd"));
    }

    @Test
    void shouldBeInvalidWhenPasswordHasNoUppercaseLetter() {
        assertFalse(PasswordValidator.isValidPassword("abcdefghijklmnop"));
    }

    @Test
    void shouldBeInvalidWhenPasswordHasNoLowercaseLetter() {
        assertFalse(PasswordValidator.isValidPassword("ABCDEFGHIJKLMNOP"));
    }

    @Test
    void shouldBeInvalidWhenPasswordHasNoNumber() {
        assertFalse(PasswordValidator.isValidPassword("AbCdEfGhIjKlMnOp"));
    }

    @Test
    void shouldBeValidWhenAllRequirementsAreFulfilled() {
        assertTrue(PasswordValidator.isValidPassword("Abcdefghikl2"));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> PasswordValidator.isValidPassword(null));
    }
}
