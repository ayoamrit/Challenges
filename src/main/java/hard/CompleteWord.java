package hard;

public class CompleteWord {

    /*
    An input string can be completed if additional letters can be added and no letters
    need to be taken away to match the word. Furthermore, the order of the letters in the
    input string must be the same as the order of letters in the final word.

    Create a function that, given an input string, determines if the word can be completed.

    Example:
    canComplete("butl", "beautiful") ➞ true
    We can add "ea" between "b" and "u", and "ifu" between "t" and "l".

    canComplete("butlz", "beautiful") ➞ false
    "z" does not exist in the word beautiful.

    canComplete("tulb", "beautiful") ➞ false
    Although "t", "u", "l" and "b" all exist in "beautiful", they are incorrectly ordered.

    canComplete("bbutl", "beautiful") ➞ false
    Too many "b"s, beautiful has only 1.
     */

    private static int[] charIndex = new int[5];

    public CompleteWord(){
        String main = "beautiful";
        String string = "butl";
        String string2 = "butlz";
        String string3 = "tulb";
        String string4 = "bbutl";

        if(checkExistence(string2, main, 0)){
            System.out.println("Your char has been found in the string");
        }

    }

    private void canComplete(String string, String main){

    }

    private boolean checkExistence(String string, String main, int x){
        if(x >= string.length()){
            return true;
        }
        else{
            char c = string.charAt(x);
            int getIndex = main.indexOf(c);

            if(getIndex != -1){
                charIndex[x] = getIndex;
                return checkExistence(string, main, x+1);
            }
            else{
                System.out.println("Char '"+c+"' does not exist in "+main);
                return false;
            }
        }

    }
}
