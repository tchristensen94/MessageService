package messageservice;

/**
 * Created by Timothy on 9/15/2014.
 */
public class Main {

    public static void main(String args[]) {
        MessageService ms = new MessageService(new KeyboardReader(), new GUISender());

        ms.processMessage();
    }
}
