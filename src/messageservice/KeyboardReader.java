package messageservice;

import java.util.Scanner;

/**
 * Created by Timothy on 9/15/2014.
 */
public class KeyboardReader implements MessageReader {

    private Scanner keyboard;

    public KeyboardReader() {
        keyboard = new Scanner(System.in);
    }

    @Override
    public String readMessage() {
        System.out.println("Enter your message: ");
        String input = keyboard.nextLine();
        return input;
    }
}
