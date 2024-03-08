package co.operations.string;
import co.reverse.string.ReverseString;
public class StringProgram {

    public static void main(String[] args){
        String receivedString = ReceiveString.receiveString();

        System.out.println("Received string: " + receivedString);

        String reversedString = ReverseString.reverseString(receivedString);

        System.out.println("Reversed string: " + reversedString);

    }
}
