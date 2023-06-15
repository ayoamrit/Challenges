package easy;

public class Vowels {
    /*
    Return the number (count) of vowels in the given string.
    We will consider (a, e, i, o, u) as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
     */

    public Vowels(){
        String string = "abracadabra";
        String string2 = "ayoamrit";
        String string3 = "Hmmm";

        int count = getCount(string2);

        if(count == 0){
            System.out.println("The string does not contain vowels.");
        }
        else{
            System.out.println("The string contain "+count+" vowels.");
        }
    }

    private static int getLength(String string){
        return string.length();
    }

    private static int getCount(String string){
        int length = getLength(string);
        int vowelCount = 0;

        for(int x = 0; x< length; x++){
            char c = string.charAt(x);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
