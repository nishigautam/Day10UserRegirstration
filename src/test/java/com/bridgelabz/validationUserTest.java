package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class validationUserTest {
    /**
     * UC1 : Below method is for First Name validation.
     *
     * testValidationFirstname() includes the test cases to check the usecase is valid or not.
     */
    @Test
    public void testValidationFirstname() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Abc");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testInvalidFirstName() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("abc");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testShortFirstName() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("ab");
        Assert.assertEquals(false, result);
    }

    /**
     * UC2 : Below method is for Last Name validation.
     *
     * testValidationLastname() includes the test cases to check the usecase is valid or not.
     */
    @Test
    public void testValidationLastname() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateLastName("Abc");
        Assert.assertEquals( true, result);
    }

    @Test
    public void testInvalidLastname() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateLastName("abc");
        Assert.assertEquals( false, result);
    }

    @Test
    public void testShortLastName() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateLastName("ab");
        Assert.assertEquals( false, result);
    }

    /**
     * UC3 : Below method is for Email validation.
     *
     * testValidationEmail() includes the test cases to check the usecase is valid or not.
     */
    @Test
    public void testValidEmail() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmail("abc@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testInvalidEmail() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmail("abc123@.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testShortEmail() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmail("abc123@.com.com");
        Assert.assertEquals(false, result);
    }

    /**
     * UC4 : Below method is for MobileFormat validation.
     *
     * testValidationMobileFormat() includes the test cases to check the Number is valid or not.
     */
    @Test
    public void testValidationMobileFormat() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateMobileFormat("91 9921749375");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testInvalidMobileFormat() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateMobileFormat("918372884385");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testShortInvalidMobileFormat() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateMobileFormat("98 76543281");
        Assert.assertEquals(false, result);
    }

    /**
     * UC5 - UC8 : Below method is for Password validation.
     *
     * testValidationPassword() includes the all the test cases provided to check the Password is valid or not.
     */
    @Test
    public void testValidationPassword() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("Abcrtd@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testInvalidPassword() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("abcdefghk");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testShortInvalidPassword() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("Abc12@");
        Assert.assertEquals(false, result);
    }
}