package test;
import org.junit.Test;

import exemple.StringManager;

import static org.junit.Assert.assertEquals;


public class StringManagerTest {

    @Test
    public void testStringReverseWithEvenLengthString() {
        String input = "hello";
        String expectedOutput = "olleh";
        String actualOutput = StringManager.StringReverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testStringReverseWithOddLengthString() {
        String input = "world";
        String expectedOutput = "dlrow";
        String actualOutput = StringManager.StringReverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testStringReverseWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = StringManager.StringReverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testStringReverseWithSingleCharString() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = StringManager.StringReverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testStringReverseWithSpecialCharsAndNumbers() {
        String input = "!@#$%^&*()1234567890";
        String expectedOutput = "0987654321)(*&^%$#@!";
        String actualOutput = StringManager.StringReverse(input);
        assertEquals(expectedOutput, actualOutput);
    }
}

