package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorUtilTest {

    @Test
    public void testGetAddition_GiveTeenAndFive_ShouldReturnFifteen(){
        //Arrange
        int expectedResult = 15;
        int numberOne = 10;
        int numberTwo = 5;
        //Act
        int actualResult = CalculatorUtil.getAddition(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetSubtraction_GiveFiveAndTwo_ShouldReturnThree(){
        //Arrange
        int expectedResult = 3;
        int numberOne = 5;
        int numberTwo = 2;
        //Act
        int actualResult = CalculatorUtil.getSubtraction(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetDivision_GiveTwoAndTwo_ShouldReturnOne() {
        //Arrange
        int expectedResult = 1;
        int numberOne = 2;
        int numberTwo = 2;
        //Act
        int actualResult = CalculatorUtil.getDivision(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetMultiplication_GiveFiveAndFour_ShouldReturnTwenty() {
        //Arrange
        int expectedResult = 20;
        int numberOne = 5;
        int numberTwo = 4;
        //Act
        int actualResult = CalculatorUtil.getMultiplication(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}