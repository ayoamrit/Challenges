package medium;

public class PalindromeWord {

    /*
    Create a recursive function that determines whether a word is a palindrome or not.

    Example:
    isPalindrome("madam") ➞ true
    isPalindrome("ayoamrit") ➞ false
    isPalindrome("bob") ➞ true
     */

    public PalindromeWord(){

        //Define variables
        String string = "madam";
        String string2 = "ayoamrit";
        String string3 = "bob";

        //Call the isPalindrome method and print the result
        System.out.println(isPalindrome(string2, 0, string2.length() - 1));
    }

    //Recursive method to check if a string is a palindrome
    private static boolean isPalindrome(String string, int start, int end){
        //Get the characters at the start and end indices
        char x = string.charAt(start);
        char y = string.charAt(end);

        // Check if the characters are different
        if(x != y){
            return false;  // Not a palindrome
        }
        else if(start == end){
            return true;  //Base case: when the starting and ending point are same
        }
        else{
            // Recursively call the isPalindrome method with updated variables
            return isPalindrome(string, start +1, end - 1);
        }
    }
}
