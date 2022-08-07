package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class NameUtilTest {

    @Test
    public void testSetTypeName_GiveLoggerName_ShouldInsertLoggerName(){
        //Arrange
        String expectedResult = NameUtil.messageOption + NameUtil.nameOptions.LOGGER;
        //Act
        String actualResult = NameUtil.setTypeName("ysnaldo");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetTypeName_GiveUpperName_ShouldInsertUpperName(){
        //Arrange
        String expectedResult = NameUtil.messageOption + NameUtil.nameOptions.UPPER;
        //Act
        String actualResult =  NameUtil.setTypeName("YSNALDO");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetTypeName_GiveMixerName_ShouldInsertMixerName(){
        //Arrange
        String expectedResult = NameUtil.messageOption + NameUtil.nameOptions.MIXER;
        //Act
        String actualResult =  NameUtil.setTypeName("Ysnaldo");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetTypeName_GiveNotName_ShouldInsertNotName(){
        //Arrange
        String expectedResult = NameUtil.messageOption + NameUtil.nameOptions.NOT_NAME;
        //Act
        String actualResult = NameUtil.setTypeName("12345");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}