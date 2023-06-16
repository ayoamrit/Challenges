package medium;

public class DigitCount {
    /*
    Create a function that recursively counts the integer's number of digits.

    Example:
    count(318) ➞ 3
    count(-92563) ➞ 5
    count(4666) ➞ 4
    count(-314890) ➞ 6
     */

    public DigitCount(){
        //Declaring variables
        int number = 318;
        int number2 = 314890;

        // Calling the method and printing the result
        System.out.println("Number of digits: "+countDigits(number2));
    }

    //Method counting the number is digits in a number using recursion
    private static int countDigits(int number){

        //Base case
        if(number == 0){
            return 0;
        }
        else{
            //Calling method recursively and adding 1 everytime the method is called.
            return 1 + countDigits(number/10);
        }
    }
}
