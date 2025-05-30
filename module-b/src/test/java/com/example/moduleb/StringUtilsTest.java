package com.example.moduleb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the StringUtils class.
 */
public class StringUtilsTest {
    
    private final StringUtils stringUtils = new StringUtils();
    
    @Test
    public void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"), "Reversing 'abc' should be 'cba'");
        assertEquals("", stringUtils.reverse(""), "Reversing empty string should be empty string");
        assertNull(stringUtils.reverse(null), "Reversing null should return null");
    }
    
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"), "'racecar' should be a palindrome");
        assertTrue(stringUtils.isPalindrome("A man, a plan, a canal: Panama"), "'A man, a plan, a canal: Panama' should be a palindrome");
        assertTrue(stringUtils.isPalindrome(""), "Empty string should be a palindrome");
        assertFalse(stringUtils.isPalindrome("hello"), "'hello' should not be a palindrome");
        assertFalse(stringUtils.isPalindrome(null), "null should not be a palindrome");
    }
    
    @Test
    public void testCountChar() {
        assertEquals(3, stringUtils.countChar("banana", 'a'), "Count of 'a' in 'banana' should be 3");
        assertEquals(0, stringUtils.countChar("hello", 'z'), "Count of 'z' in 'hello' should be 0");
        assertEquals(0, stringUtils.countChar("", 'a'), "Count of 'a' in empty string should be 0");
        assertEquals(0, stringUtils.countChar(null, 'a'), "Count of 'a' in null should be 0");
    }
}