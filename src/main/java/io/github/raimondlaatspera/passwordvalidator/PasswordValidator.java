package io.github.raimondlaatspera.passwordvalidator;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {

        if (password == null) throw new IllegalArgumentException("password cannot be null");
        if (password.length() < 8) return false;

        char ch;
        boolean hasUppercaseLetter = false;
        boolean hasLowercaseLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            if (hasNumber && hasUppercaseLetter && hasLowercaseLetter) break;

            ch = password.charAt(i);
            if (Character.isDigit(ch)) hasNumber = true;
            else if (Character.isUpperCase(ch)) hasUppercaseLetter = true;
            else if (Character.isLowerCase(ch)) hasLowercaseLetter = true;
        }

        return hasNumber && hasLowercaseLetter && hasUppercaseLetter;
    }
}
