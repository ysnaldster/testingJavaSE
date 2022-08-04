package com.platzi.javatests.util;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void testSetPasswordWeak_GivenWeakPassword_ShouldReturnLowEightLetters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1212!"));
    }

    @Test
    public void testSetPasswordMedium_GivenLetterAndNumbers_ShouldReturnLettersAndNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234asa"));
    }

    @Test
    public void testSetPasswordMedium_GivenNumbersAndSymbols_ShouldReturnNumbersAndSymbols() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}