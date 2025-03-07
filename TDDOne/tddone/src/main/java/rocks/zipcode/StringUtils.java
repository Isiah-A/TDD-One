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
        int count = 0;
        char [] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == c){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPalindrome(String str) {
        String pal = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(pal);
        return pal.equals(String.valueOf(sb.reverse()));
    }
}

