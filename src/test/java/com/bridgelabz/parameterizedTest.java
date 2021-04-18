package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class parameterizedTest {
    String email;
    boolean expected;

    public parameterizedTest(String email, boolean result) {
        this.email = email;
        this.expected = result;
    }

    /**
     * the given parameters below is to check the emails which has been predefined by a pattern.
     *
     * @return input as the email is valid or not.
     */

    @Parameterized.Parameters
    public static List getInput() {
        List input = new ArrayList();
        input.add(new Object[]{"abc@yahoo.com",true});
        input.add(new Object[]{"abc-100@yahoo.com,",true});
        input.add(new Object[]{"abc.100@yahoo.com",true});
        input.add(new Object[]{"abc111@abc.com",true});
        input.add(new Object[]{"abc-100@abc.net",true});
        input.add(new Object[]{"abc.100@abc.com.au",true});
        input.add(new Object[]{"abc@1.com",true});
        input.add(new Object[]{"abc@gmail.com.com",true});
        input.add(new Object[]{"abc+100@gmail.com",true});
        input.add(new Object[]{"abc",false});
        input.add(new Object[]{"abc@.com.my",false});
        input.add(new Object[]{"abc123@gmail.a",false});
        input.add(new Object[]{"abc123@.com",false});
        input.add(new Object[]{"abc123@.com.com",false});
        input.add(new Object[]{".abc@abc.com",false});
        input.add(new Object[]{"abc()*@gmail.com",false});
        input.add(new Object[]{"abc@%*.com",false});
        input.add(new Object[]{"abc..2002@gmail.com",false});
        input.add(new Object[]{"abc.@gmail.com",false});
        input.add(new Object[]{"abc@abc@gmail.com",false});

        return input;
    }

    @Test
    public void testEmail() {
        UserValidation userValidation = new UserValidation();
        Assert.assertEquals(this.expected, userValidation.validateEmail(this.email));
    }
}