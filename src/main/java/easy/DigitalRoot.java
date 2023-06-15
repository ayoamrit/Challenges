package easy;

public class DigitalRoot {

    /*
    Given n, take the sum of the digits of n. If that value has more than one digit,
    continue reducing in this way until a single-digit number is produced.
    The input will be a non-negative integer.

    For example:
    16  -->  1 + 6 = 7
    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
     */

    public DigitalRoot(){
        // Declaring variables
        int number = 16, number2 = 942, number3 = 132189, number4 = 493193;

        // Getting sum of the number by adding its digits
        int sum = getSum(number4);

        //Using while loop to count sum of the sum
        while(true){
            System.out.print(sum);
            int length = numberLength(sum);

            // Breaking the loop when length of a number is 1
            if(length == 1){
                break;
            }
            else{
                System.out.print(" --> ");
                sum = getSum(sum);
            }
        }
    }

    // Method returning length of a number
    private int numberLength(int number){
        return String.valueOf(number).length();
    }

    // Using recursion to get the sum of a number
    private int getSum(int number){
        if(number <= 0){
            return 0;
        }
        else{
            return (number % 10) + getSum(number/10);
        }
    }
}
