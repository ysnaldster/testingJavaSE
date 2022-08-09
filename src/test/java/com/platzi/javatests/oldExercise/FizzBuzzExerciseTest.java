package com.platzi.javatests.oldExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzExerciseTest {
    private String expectedResultFizz;
    String expectedResultBuzz;
    private String expectedResultFizzBuzz;

    @BeforeEach
    void setUp() {
        expectedResultFizz = "Fizz";
        expectedResultBuzz = "Buzz";
        expectedResultFizzBuzz = "FizzBuzz";
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleByThree_ShouldReturnFizz() {
        //Arrange
        int assessmentValue = 3;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultFizz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleBySix_ShouldReturnFizz() {
        //Arrange
        int assessmentValue = 6;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultFizz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleByFive_ShouldReturnBuzz() {
        //Arrange
        int assessmentValue = 5;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultBuzz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleByTeen_ShouldReturnBuzz() {
        //Arrange
        int assessmentValue = 10;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultBuzz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleByFifteen_ShouldReturnFizzBuzz() {
        //Arrange
        int assessmentValue = 15;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultFizzBuzz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenDivisibleByThirty_ShouldReturnFizzBuzz() {
        //Arrange
        int assessmentValue = 30;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(expectedResultFizzBuzz, actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenIsNotDivisibleByThreeOrFive_ShouldReturnNumberTwo() {
        //Arrange
        int assessmentValue = 2;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(String.valueOf(assessmentValue), actualResult);
    }

    @Test
    public void testFizzBuzzExercise_GivenIsNotDivisibleByThreeOrFive_ShouldReturnNumberSixteen() {
        //Arrange
        int assessmentValue = 16;
        //Act
        String actualResult = FizzBuzzExercise.fizzBuzz(assessmentValue);
        //Assert
        Assertions.assertEquals(String.valueOf(assessmentValue), actualResult);
    }

}