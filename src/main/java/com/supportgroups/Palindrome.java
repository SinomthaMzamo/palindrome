package com.supportgroups;

/**
 * Hello world!
 *
 */
public class Palindrome
{
    /**
     * Checks if a given string is a palindrome or not.
     *
     * @param string the string to check for palindrome property.
     * @return true if the string is a palindrome, false otherwise.
     */
    static boolean isPalindrome(String string) {

        string = string.toLowerCase();
        // handle the base case: empty string literal "" and string only contains one letter
        if (string.isEmpty() || string.length()==1) {
            return true;
        }
        // compare the first character to the last
        if (string.charAt(0) == string.charAt(string.length()-1))
            // recursive case: slice off the confirmed equal endpoints and repeat
            return isPalindrome(string.substring(1, string.length()-1));
        return false;
    }

    /**
     * Checks if a given string is a palindrome or not.  (by reversing the strings and comparing equality)
     *
     * @param string the string to check for palindrome property.
     * @return true if the string is a palindrome, false otherwise.
     */
    static boolean isPalindromeReverse(String string) {
        string = string.toLowerCase();

        // reverse the string
        StringBuilder reversedString = new StringBuilder();
        for (int index = string.length()-1; index >= 0; --index) {
            reversedString.append(string.charAt(index));
        }
        // check equality
        return reversedString.toString().equals(string);
    }

    /**
     * Checks if a given string is a palindrome or not.  (iterative version)
     *
     * @param string the string to check for palindrome property.
     * @return true if the string is a palindrome, false otherwise.
     */
    static boolean isPalindromeIter(String string) {
        string = string.toLowerCase();
        int lastIndex;
        // slice the endpoints off as long as there's more than one letter
        while (string.length() > 1) {
            // update lastIndex using length
            lastIndex = string.length()-1;
            // check equality of endpoints
            if (string.charAt(0) == string.charAt(lastIndex)) {
                // slice the endpoints off
                string = string.substring(1, lastIndex);
            }
            else
                // return false if they differ
                return false;

        }
        // at this point there's at most one character remaining in the string, this means the word is a palindrome
        return true;
    }
}
