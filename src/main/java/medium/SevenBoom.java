package medium;

public class SevenBoom {
    /*
    Create a function that takes an array of numbers and return "Boom!"
    if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

    Example:
    sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
    * 7 contains the number seven.

    sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
    * None of the items contain 7 within them.

    sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
    * 97 contains the number seven.
     */

    public SevenBoom(){
        // Constructor: Create a new instance of the class
        int[] number = {1,2,3,4,5,6,7};
        int[] number2 = {8,6,33,100};
        int[] number3 = {2,55,60,97,86};

        //Check if the array contains number 7 and print the result.
        if(checkSeven(number)){
            System.out.println("Boom! The array contain number 7.");
        }
        else System.out.println("Uhhh! The array does not contain number 7.");
    }

    private static boolean checkSeven(int[] array){
        //Check if the array contains number 7
        int length = array.length;
        boolean flag = false;

        //Iterate over each number in the array
        for(int x = 0; x < length; x++){
            //Get the number of digits in the current number
            int numberLength = String.valueOf(array[x]).length();
            int number = array[x];

            //Check each digit of the current number
            for(int y = 0; y < numberLength; y++){

                //Extract the last digit of the number
                if((number%10) == 7){

                    //If the digit is 7, set the flag to true and break the loop
                    flag = true;
                    break;
                }
                else{
                    //Remove the last digit from the number
                    number = number/10;
                }
            }
        }

        //Return the flag indicating whether 7 was found
        return flag;
    }
}
