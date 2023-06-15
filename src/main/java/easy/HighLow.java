package easy;

public class HighLow {

    /*
    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.

    Example:
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"

    Notes:
    * All numbers are valid Int32, no need to validate them.
    * There will always be at least one number in the input string.
    * Output string must be two numbers separated by a single space, and highest number is first.
     */

    public HighLow(){
        String number = "1 2 3 4 5";
        String number2 = "1 2 -3 4 5";
        String number3 = "1 9 3 4 -5";
        System.out.println(getHighLow(number));
    }

    private static String getHighLow(String string){
        // Split the string into an array of numbers
        String[] numbersArray = splitString(string);

        // Initialize variables to store the highest and lowest numbers
        int highest = 0;
        int lowest = 1;

        // Iterate over each number in the array
        for(int x =0;x<numbersArray.length;x++){

            // Convert the current number from string to integer
            int currentNumber = Integer.parseInt(numbersArray[x]);

            // Check if the current number is higher than the current highest
            if(highest < currentNumber){
                highest = currentNumber;
            }

            // Check if the current number is lower than the current lowest
            if(lowest > currentNumber){
                lowest = currentNumber;
            }
        }

        // Return the highest and the lowest numbers as a string
        return highest+" "+lowest;
    }

    private static String[] splitString(String string){
        // Split the input string into an array of substring using a space as the delimiter
        return string.split(" ");
    }
}
