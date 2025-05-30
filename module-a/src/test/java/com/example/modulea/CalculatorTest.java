package com.example.modulea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 * Note: The divide method is intentionally not tested here, it will be tested in module-c.
 */
public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");
        assertEquals(-5, calculator.add(-2, -3), "-2 + -3 should equal -5");
    }
    
    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
        assertEquals(-4, calculator.subtract(-2, 2), "-2 - 2 should equal -4");
        assertEquals(1, calculator.subtract(-2, -3), "-2 - -3 should equal 1");
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-4, calculator.multiply(-2, 2), "-2 * 2 should equal -4");
        assertEquals(6, calculator.multiply(-2, -3), "-2 * -3 should equal 6");
    }
    
    // The divide method is intentionally not tested here
    // It will be tested in module-c
}