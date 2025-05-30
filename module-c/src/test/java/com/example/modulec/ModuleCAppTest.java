package com.example.modulec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

import com.example.modulea.Calculator;

/**
 * Unit tests for the ModuleCApp class.
 * This also tests the divide method from Calculator in module-a that was intentionally not tested there.
 */
public class ModuleCAppTest {

    private final ModuleCApp app = new ModuleCApp();
    private final Calculator calculator = new Calculator();

    @Test
    public void testPerformOperation() {
        assertEquals("10 + 5 = 15", app.performOperation(10, 5, "add"));
        assertEquals("10 - 5 = 5 (palindrome)", app.performOperation(10, 5, "subtract"));
        assertEquals("10 * 5 = 50", app.performOperation(10, 5, "multiply"));
        assertEquals("10 / 5 = 2 (palindrome)", app.performOperation(10, 5, "divide"));

        // Test with a palindrome result
        assertEquals("11 + 0 = 11 (palindrome)", app.performOperation(11, 0, "add"));
    }

    @Test
    public void testPerformOperationWithInvalidOperation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            app.performOperation(10, 5, "invalid");
        });

        String expectedMessage = "Unknown operation: invalid";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Tests the divide method from Calculator in module-a.
     * This method was intentionally not tested in module-a.
     */
    @Test
    public void testCalculatorDivide() {
        // Test normal division
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(0, calculator.divide(1, 2));
        assertEquals(-2, calculator.divide(10, -5));
        assertEquals(-2, calculator.divide(-10, 5));
        assertEquals(2, calculator.divide(-10, -5));

        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        String expectedMessage = "Division by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
