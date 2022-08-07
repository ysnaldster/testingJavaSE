package com.platzi.javatests.util;
import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void testSetPasswordWeak_GivenWeakPassword_ShouldReturnLowEightLetters() {
        //Arrange
        PasswordUtil.SecurityLevel expectedResult = PasswordUtil.SecurityLevel.WEAK;
        String assessmentValue = "1212!";
        //Act
        PasswordUtil.SecurityLevel actualResult = PasswordUtil.assessPassword(assessmentValue);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetPasswordMedium_GivenLetterAndNumbers_ShouldReturnLettersAndNumbers() {
        //Arrange
        PasswordUtil.SecurityLevel expectedResult = PasswordUtil.SecurityLevel.MEDIUM;
        String assessmentValue = "abcd1234asa";
        //Act
        PasswordUtil.SecurityLevel actualResult = PasswordUtil.assessPassword(assessmentValue);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetPasswordMedium_GivenNumbersAndSymbols_ShouldReturnNumbersAndSymbols() {
        //Arrange
        PasswordUtil.SecurityLevel expectedResult = PasswordUtil.SecurityLevel.STRONG;
        String assessmentValue = "abcd1234!";
        //Act
        PasswordUtil.SecurityLevel actualResult = PasswordUtil.assessPassword(assessmentValue);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}