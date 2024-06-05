package com.supportgroups;

import org.junit.jupiter.api.*;

import java.util.*;

import static com.supportgroups.Palindrome.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
{
    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("level"));
        assertFalse(isPalindrome("Hello"));
        assertTrue(isPalindrome(""));
        assertTrue(isPalindrome("A"));
        assertTrue(isPalindrome("Racecar"));
    }

    @Test
    void testIsPalindromeIter() {
        assertTrue(isPalindromeIter("level"));
        assertFalse(isPalindromeIter("Hello"));
        assertTrue(isPalindromeIter(""));
        assertTrue(isPalindromeIter("A"));
        assertTrue(isPalindromeIter("Racecar"));
    }

    @Test
    void testIsPalindromeReverse() {
        assertTrue(isPalindromeReverse("level"));
        assertFalse(isPalindromeReverse("Hello"));
        assertTrue(isPalindromeReverse(""));
        assertTrue(isPalindromeReverse("A"));
        assertTrue(isPalindromeReverse("Racecar"));
    }
}
