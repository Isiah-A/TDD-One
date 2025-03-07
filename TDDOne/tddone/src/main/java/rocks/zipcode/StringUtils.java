package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        return sb.toString();
    }
    
    public static int countOccurrences(String str, char c) {
        // Your implementation here
        return 0;
    }
    
    public static boolean isPalindrome(String str) {
       StringBuilder sb = new StringBuilder();

        return false;
    }
}

