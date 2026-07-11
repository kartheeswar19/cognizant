package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup: create a fresh Calculator before each test.
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        // Teardown: clear the calculator reference after each test.
        calculator = null;
    }

    @Test
    public void testAddition() {
        // Arrange: define the input values for the test.
        int a = 5;
        int b = 7;
        int expected = 12;

        // Act: execute the method under test.
        int result = calculator.add(a, b);

        // Assert: verify the result.
        assertEquals(expected, result);
    }
}
