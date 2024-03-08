package co.reverse.string;

public class ReverseString {

    public static void reverseString(String stringToBeReversed){

        String reversedString = "";
        for(int i = stringToBeReversed.length()-1; i >= 0; i--){
            System.out.println(stringToBeReversed.charAt(i));
        }
    }
}
