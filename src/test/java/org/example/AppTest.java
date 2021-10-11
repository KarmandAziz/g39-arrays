package org.example;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void arrayToStringReturnExpectedResult() {
        //Arrange - Setting up the test
        String[] testData = {"Erik Svensson", "Karmand Aziz"};
        String expected = "[Erik Svensson, Karmand Aziz]";

        //Act - performing the test
        String actual = App.arrayToString(testData);

        //Assert - evaluating the result
        assertEquals(actual, expected);

    }
    @Test
    public void testAddToStringArray() {
        String[] testArrayData = {};
        String string = "Say hello to the cute baby";
        String[] expected = {"Say hello to the cute baby"};

        String[] actual = App.addToStringArray(testArrayData, string);

        assertArrayEquals(actual, expected);
    }
}
