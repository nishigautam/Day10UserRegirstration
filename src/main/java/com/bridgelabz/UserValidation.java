package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    /**
     * UC1: To validate the firstname starts with Cap and has minimum 3 characters.
     *
     * FIRST_NAME_PATTERN checks the pattern pre-defining to validate its function.
     */
    private final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    Pattern pattern;

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher match = pattern.matcher(firstName);
        boolean result = match.matches();
        return result;
    }

    /**
     * UC2: To validate the lastname starts with Cap and has minimum 3 characters.
     *
     * LAST_NAME_PATTERN checks the pattern pre-defining to validate its function.
     */
    private final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher match = pattern.matcher(lastName);
        boolean result = match.matches();
        return result;
    }

    /**
     * UC3: To validate the Email address consist of 3 Mandatory parts.
     *
     * abc.xyz@bl.co.in
     *
     * EMAIL_PATTERN checks the pattern pre-defining to validate its function.
     */
    private final String EMAIL_PATTERN = "^[a-zA-Z]+([.][a-zA-Z]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher match = pattern.matcher(email);
        boolean result = match.matches();
        return result;
    }

    /**
     * UC4: To validate the Mobile Format.
     *
     * MOBILE_PATTERN checks the pattern pre-defining to validate its function.
     */
    private final String MOBILE_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";

    public boolean validateMobileFormat(String mobile) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        Matcher match = pattern.matcher(mobile);
        boolean result = match.matches();
        return result;
    }

    /**
     * UC5 to UC8: The below method includes all use cases provided to validate the Password.
     *
     * Rule1 - minimum 8 Characters.
     *
     * Rule2 - Should have at least 1 Upper Case.
     *
     * Rule3 - Should have at least 1 numeric number.
     *
     * Rule4 - Should have at least 1 special character.
     *
     * PASSWORD_PATTERN checks the pattern pre-defining to validate all functions required.
     */
    private final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher match = pattern.matcher(password);
        boolean result = match.matches();
        return result;
    }

    /**
     * UC9: Should clear all email samples provided separately
     *
     * MULTIPLE_EMAIL_PATTERN checks the pattern pre-defining to validate its function.
     */
    private final String MULTIPLE_EMAIL_PATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public boolean validateMultipleEmail(String email) {
        Pattern pattern = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher match = pattern.matcher(email);
        boolean result = match.matches();
        return result;
    }
}