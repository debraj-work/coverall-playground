package com.example.moduleb;

/**
 * Utility class for string operations.
 */
public class StringUtils {
    
    /**
     * Reverses a string.
     * 
     * @param input the string to reverse
     * @return the reversed string
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Checks if a string is a palindrome (reads the same forward and backward).
     * 
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    
    /**
     * Counts the occurrences of a character in a string.
     * 
     * @param input the string to search in
     * @param c the character to count
     * @return the number of occurrences
     */
    public int countChar(String input, char c) {
        if (input == null) {
            return 0;
        }
        
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}