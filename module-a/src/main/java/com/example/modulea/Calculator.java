package com.example.modulea;

/**
 * A simple calculator class with basic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     * 
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from first number.
     * 
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     * 
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides first number by second number.
     * This method will be tested in module-c, not in module-a.
     * 
     * @param a first number
     * @param b second number
     * @return quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}