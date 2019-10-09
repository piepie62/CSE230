/*
 * Christopher Feger, CSE230, Assignment 1
 * The Palindrome class tests
 */
package assign1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Palindrome tests: checks every case I could think of for palindromicity
 * @author chris
 */
public class PalindromeTest {

    @Test
    public void testIsPalindromeFalseOdd() {
        Palindrome p = new Palindrome("hello");
        assertFalse(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeFalseEven() {
        Palindrome p = new Palindrome("oink");
        assertFalse(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTrue() {
        Palindrome p = new Palindrome("0110");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTrueOdd() {
        Palindrome p = new Palindrome("01210");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTrueCase() {
        Palindrome p = new Palindrome("WhoopsSPOOHw");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTruePunctuation()
    {
        Palindrome p = new Palindrome("Oh,IseeeesIhO");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTrueSpaces()
    {
        Palindrome p = new Palindrome("Hi elbowwobleiH");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeTrueNormalExample()
    {
        Palindrome p = new Palindrome("Madam, I'm Adam");
        assertTrue(p.isPalindrome());
    }
    
    @Test
    public void testIsPalindromeFalseNormalExample()
    {
        Palindrome p = new Palindrome("My name is Adam, ma'am");
        assertFalse(p.isPalindrome());
    }
    
}
