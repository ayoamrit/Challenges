package easy;

public class DoubleChar {
    /*
    Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

    Example:
    * "String"      -> "SSttrriinngg"
    * "Hello World" -> "HHeelllloo  WWoorrlldd"
    * "1234!_ "     -> "11223344!!__  "
     */

    public DoubleChar(){
        // Create a new instance of the class
        // and print the result of recursiveString() method
        String string = "ayoamrit !";
        System.out.println(recursiveString(string, "",getLength(string),0));
    }

    private static String getString(String string){
        // Get the length of the input string
        int length = getLength(string);

        //Initialize an empty string to store the result
        String doubleCharString = "";

        //Iterate over each character in the string
        for(int x =0; x< length;x++){

            //Get the current character
            char c = string.charAt(x);

            //Check if the current character is a whitespace
            if(Character.isWhitespace(c)){
                // If it is a whitespace, append it to the result string
                doubleCharString = doubleCharString + c;
            }
            else{
                //If it is not a whitespace, append it twice to the result string
                doubleCharString = doubleCharString + c + c;
            }
        }

        //Return the resulting string with the doubled characters
        return doubleCharString;
    }

    private String recursiveString(String string, String str, int length, int x){

        //Base case: when the index reaches the length of the string, return the result string
        if(x==length){
            return str;
        }
        else{

            //Get the character at the current index
            char c = string.charAt(x);

            //Check if the current character is a whitespace
            if(Character.isWhitespace(c)){
                //If it is a whitespace, append it to the result string
                str = str + c;
            }
            else{
                // If it is not a whitespace, append it twice to the result string
                str = str + c + c;
            }

            //Recursively call the method with the updated string and index
            return recursiveString(string, str, length, x+1);
        }
    }

    private static int getLength(String string){
        // Get the length of the input string
        return string.length();
    }
}
