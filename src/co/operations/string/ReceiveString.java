package co.operations.string;
import java.util.Scanner;

public class ReceiveString {

    public static String receiveString(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to be reversed: ");

        return scanner.nextLine();

    }

}
