package test;

import org.junit.Test;

import exemple.SmallestIntegerFinder;

import static org.junit.Assert.*;

public class SmallestIntegerFinderTest {
    @Test
    public void testFindSmallestIntWithPositiveIntegers() {
        int[] input = {5, 8, 2, 4, 6};
        int expectedOutput = 2;
        int actualOutput = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testFindSmallestIntWithNegativeIntegers() {
    	 int[] input = {-5, -8, -2, -4, -6};
         int expectedOutput = -8;
         int actualOutput = SmallestIntegerFinder.findSmallestInt(input);
         assertEquals(expectedOutput, actualOutput);
     }
     @Test
     public void testFindSmallestIntWithMixedIntegers() {
         int[] input = {5, -8, 2, -4, 6};
         int expectedOutput = -8;
         int actualOutput = SmallestIntegerFinder.findSmallestInt(input);
         assertEquals(expectedOutput, actualOutput);
     }
     @Test
     public void testFindSmallestIntWithSingleInteger() {
         int[] input = {5};
         int expectedOutput = 5;
         int actualOutput = SmallestIntegerFinder.findSmallestInt(input);
         assertEquals(expectedOutput, actualOutput);
     }
     @Test
     public void testFindSmallestIntWithEmptyArray() {
         int[] input = {};
         int expectedOutput = 0;
         int actualOutput = SmallestIntegerFinder.findSmallestInt(input);
         assertEquals(expectedOutput, actualOutput);
     }
 }
