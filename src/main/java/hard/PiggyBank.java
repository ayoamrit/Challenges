package hard;

public class PiggyBank {

    /*
    John wants to save money for his first car. He puts money in his piggy bank every day. Every day, he puts in $1
    more than the previous day. Every Monday he starts with a new value $1 more than the previous Monday.

    Week 1 (starting at $1)
    Day	Amount	Sum
    Monday	$1	$1
    Tuesday	$2	$3
    Wednesday	$3	$6
    Thursday	$4	$10
    Friday	$5	$15
    Saturday	$6	$21
    Sunday	$7	$28

    Week 2 (starting at $2)
    Day	Amount	Sum
    Monday	$2	$30
    Tuesday	$3	$33
    Wednesday	$4	$37
    etc.

   Write a function that returns the number of days he needs to buy his first car cost.
   John had some savings (include it before counting). On the first Monday, he puts
   the start amount into his piggy bank.


   Example:
    Challenge.NumberOfDays(2050, 1200, 10) ➞ 53
    * 2050: cost of car, 1200: savings, 10: start amount
    * After 53 days he can buy a car.

    Challenge.NumberOfDays(10000, 2500, 50) ➞ 123
    * After 123 days he can buy a car.

    Challenge.NumberOfDays(500, 300, 50) ➞ 4
    * After 4 days he can buy a car.

     */

    public PiggyBank(){
        // Call the getDays method with the provided arguments
        System.out.println("Days: "+getDays(2050, 1200, 10));
    }

    //Calculate the number of days required to reach the saving goals
    private static int getDays(int cost, int saving, int amount){
        int sum = 0;
        int days = 0;

        // Total remaining amount needed to reach the cost
        int total = cost - saving;

        //Continue the loop until the sum of savings reaches the total amount needed
        while(sum < total){

            //Iterate over each day of the week (7 days)
            for(int x = 0;x < 7; x++){

                //Add the savings amount for the current day to the sum
                sum = sum + (amount + x);
                days++;  //Increment the number of days
                if(sum > total){
                    break;  //If the sum exceeds the total amount needed, exit the loop
                }
            }
            amount++;  //Increase the savings amount for the next week
        }

        //Return the number of days
        return days;
    }

}
