package medium;
import java.util.Scanner;

public class SquarePatch {

    /*
    Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

    Example:

    squarePatch(3) ➞ [
      [3, 3, 3],
      [3, 3, 3],
      [3, 3, 3]
    ]

    squarePatch(5) ➞ [
      [5, 5, 5, 5, 5],
      [5, 5, 5, 5, 5],
      [5, 5, 5, 5, 5],
      [5, 5, 5, 5, 5],
      [5, 5, 5, 5, 5]
    ]

     */
    private static Scanner scanner = new Scanner(System.in);

    public SquarePatch(){
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        int[][] squarePatch = getSquarePatch(input);
        for(int x = 0; x < squarePatch.length;x++){
            for(int y = 0; y < squarePatch[x].length;y++){
                System.out.print(squarePatch[x][y]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] getSquarePatch(int number){
        int[][] squarePatch = new int[number][number];

        for(int x = 0; x< squarePatch.length;x++){
            for(int y = 0; y < squarePatch[x].length;y++){
                squarePatch[x][y] = number;
            }
        }

        return squarePatch;
    }
}
