package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorUtilTest {

    private int numberOne;
    private int numberTwo;
    @Before
    public void setup(){
        numberOne = 10;
        numberTwo = 5;
    }

    @Test
    public void testGetAddition_GiveTeenAndFive_ShouldReturnFifteen(){
        //Arrange
        int expectedResult = 15;
        //Act
        int actualResult = CalculatorUtil.getAddition(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetSubtraction_GiveTeenAndFive_ShouldReturnFive(){
        //Arrange
        int expectedResult = 5;
        //Act
        int actualResult = CalculatorUtil.getSubtraction(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetDivision_GiveTeenAndFive_ShouldReturnTwo() {
        //Arrange
        int expectedResult = 2;
        //Act
        int actualResult = CalculatorUtil.getDivision(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetMultiplication_GiveTeenAndFive_ShouldReturnFifty() {
        //Arrange
        int expectedResult = 50;
        //Act
        int actualResult = CalculatorUtil.getMultiplication(numberOne, numberTwo);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}