package test;

import org.junit.Test;

import exemple.ArraysManager;

import static org.junit.Assert.assertEquals;


public class ArraysManagerTest {
    @Test
    public void testSquareSumWithEvenLengthArray() {
        int[] input = {1, 2, 3, 4};
        int expectedOutput = 30;
        int actualOutput = ArraysManager.squareSum(input);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testSquareSumWithOddLengthArray() {
        int[] input = {1, 2, 3};
        int expectedOutput = 14;
        int actualOutput = ArraysManager.squareSum(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testSquareSumWithNegativeNumbers() {
        int[] input = {-1, 2, -3, 4};
        int expectedOutput = 30;
        int actualOutput = ArraysManager.squareSum(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testSquareSumWithZeros() {
        int[] input = {0, 0, 0};
        int expectedOutput = 0;
        int actualOutput = ArraysManager.squareSum(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testSquareSumWithEmptyArray() {
        int[] input = {};
        int expectedOutput = 0;
        int actualOutput = ArraysManager.squareSum(input);
        assertEquals(expectedOutput, actualOutput);
    }
}

