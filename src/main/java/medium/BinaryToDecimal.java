package medium;

public class BinaryToDecimal {

    /*
    Given an array of ones and zeroes, convert the equivalent binary value to an integer.
    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

    Example:
    Testing: [0, 0, 0, 1] ==> 1
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 0, 1] ==> 5
    Testing: [1, 0, 0, 1] ==> 9
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 1, 0] ==> 6
    Testing: [1, 1, 1, 1] ==> 15
    Testing: [1, 0, 1, 1] ==> 11
     */

    public BinaryToDecimal(){
        int[] array = {0,0,0,1};
        int[] array2 = {1,0,0,1};
        int[] array3 = {1,1,1,0};

        System.out.println("Decimal: "+getDecimal(array3, getLength(array3), 0));
    }

    //The method calculates the length of the array
    private int getLength(int[] array){
        return array.length - 1;
    }

    //This method converts the binary array to decimal recursively
    private int getDecimal(int[] array, int length, int x){
        if(length < 0){
            return 0;  //Base case: The length has reached the end of the array, return 0.
        }
        else{
            if(array[length]==0){

                //Recursive case: If the current element is 0,
                //move to the next element and increase the exponent by 1.
                return getDecimal(array, length - 1, x+1);
            }
            else{

                //Recursive case: If the current element is 1,
                //calculate its decimal value using the exponent and add it to the result
                return (int)(Math.pow(2,x)) + getDecimal(array, length - 1, x + 1);
            }
        }
    }

}
