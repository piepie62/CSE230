/*
 * Christopher Feger, CSE230, Assignment 1
 * The Palindrome class
 */
package assign1;

/**
 * Palindrome: A class that examines a passed in string and determines whether
 * it is a palindrome or not.
 * @author chris
 */
public class Palindrome {
    private String testString;
    /**
     * Initializes the Palindrome with a string to test
     * @param s the string to test
     */
    public Palindrome(String s)
    {
        testString = s;
    }
    
    /**
     * Tests whether the string passed in the constructor is a palindrome or not
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome()
    {
        // Assume that the string is a palindrome until determined otherwise
        boolean isPalindrome = true;
        int frontIndex = 0;
        int backIndex = testString.length() - 1;
        // Indicates whether frontIndex/backIndex should change, respectively
        boolean searchFront = false;
        boolean searchBack = false;
        while (isPalindrome && frontIndex < backIndex)
        {
            if (searchFront)
            {
                ++frontIndex;
                // Only alphanumerics contribute to palindromicity
                if (Character.isAlphabetic(testString.charAt(frontIndex)) ||
                        Character.isDigit(testString.charAt(frontIndex)))
                {
                    searchFront = false;
                }
            }
            
            if (searchBack)
            {
                --backIndex;
                // Only alphanumerics contribute to palindromicity
                if (Character.isAlphabetic(testString.charAt(backIndex)) ||
                        Character.isDigit(testString.charAt(backIndex)))
                {
                    searchBack = false;
                }
            }
            
            if (!searchBack && !searchFront)
            {
                // Case doesn't matter in palindromes
                if (Character.toLowerCase(testString.charAt(frontIndex))
                        != Character.toLowerCase(testString.charAt(backIndex)))
                {
                    isPalindrome = false;
                }
                else
                {
                    // Search for the next pair of palindrome-affecting characters
                    searchFront = searchBack = true;
                }
            }
        }
        return isPalindrome;
    }
}
