package com.platzi.javatests.player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {

    @Test
    public void testPlay_GiveLowNumber_ShouldReturnLose() {
        //Arrange
        int minNumberToWin = 3;
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, minNumberToWin);
        Boolean expectedResult = false;
        //Act
        Boolean actualResult = player.play();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPlay_GiveBigNumber_ShouldReturnWin() {
        //Arrange
        int minNumberToWin = 3;
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, minNumberToWin);
        Boolean expectedResult = true;
        //Act
        Boolean actualResult = player.play();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}