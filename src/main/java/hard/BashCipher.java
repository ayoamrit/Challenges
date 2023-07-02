package hard;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BashCipher {
    private static char[] alphabets;
    public BashCipher(){
        String string = "Hello world";

        alphabets = addAlphabets();
        System.out.println(swapAlphabets(string)) ;
    }

    private String swapAlphabets(String string){
        String swappedString = "";

        for(int x = 0; x < string.length(); x++){
            char c = Character.toLowerCase(string.charAt(x));

            for(int y = 0; y < alphabets.length; y++){


                if(Character.isWhitespace(c)) {
                    if (c == alphabets[y]) {
                        swappedString = swappedString + alphabets[alphabets.length - y - 1];
                    }
                }
            }
        }

        return swappedString;
    }

    @Contract(pure = true)
    private char @NotNull [] addAlphabets(){

        char[] alphabets = new char[26];
        char activeChar = 'a';

        for(int x = 0; x < alphabets.length;x++){
            alphabets[x] = activeChar;
            activeChar++;
        }

        return alphabets;
    }
}
