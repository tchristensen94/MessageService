package messageservice;

import javax.swing.*;

/**
 * Created by Timothy on 9/15/2014.
 */
public class GUISender implements MessageSender {
    JDialog dialog;

    @Override
    public void writeMessage(String message) {
        dialog = new JOptionPane("Message received: " + message).createDialog("Alert");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        dialog.dispose();
    }
}
