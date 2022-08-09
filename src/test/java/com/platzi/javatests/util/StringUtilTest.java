package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat_GiveOneHello_ShouldOnceHello(){
        //Arrange
        String expectedResult = "Hello";
        String assessmentValue = "Hello";
        int times = 1;
        //Act
        String actualResult = StringUtil.repeat(assessmentValue, times);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeat_GiveMultipleHello_ShouldMultipleHelloTimes(){
        //Arrange
        String expectedResult = "HelloHelloHello";
        String assessmentValue = "Hello";
        int times = 3;
        //Act
        String actualResult = StringUtil.repeat(assessmentValue, times);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeat_GiveVoid_ShouldZeroTimes(){
        //Arrange
        String expectedResult = "";
        String assessmentValue = "Hello";
        int times = 0;
        //Act
        String actualResult = StringUtil.repeat(assessmentValue, times);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeat_GiveNegative_ShouldNegativeTimes(){
        //Arrange
        String assessmentValue = "Hello";
        int times = -1;
        //Act
        StringUtil.repeat(assessmentValue, times);
    }

    @Test
    public void testIsEmpty_GivenNullValue_ShouldReturnVoid() {
        //Arrange
        Boolean expectedResult = true;
        //Act, //Assert
        Assert.assertEquals(StringUtil.isEmpty(null), expectedResult);
    }

    @Test
    public void testIsEmpty_GivenStringVoidOrSimple_ShouldReturnVoid() {
        //Arrange
        String stringVoid = "";
        Boolean expectedResult = true;
        //Act
        Boolean actualResult = StringUtil.isEmpty(stringVoid);
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsEmpty_GivenNameTest_ShouldReturnTrue() {
        //Arrange
        String stringAssessment = "test";
        Boolean expectedResult = false;
        //Act
        Boolean actualResult = StringUtil.isEmpty(stringAssessment);
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
