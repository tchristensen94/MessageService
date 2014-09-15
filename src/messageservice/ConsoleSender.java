package messageservice;

/**
 * Created by Timothy on 9/15/2014.
 */
public class ConsoleSender implements MessageSender {

    public ConsoleSender() {

    }

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
