/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;

/**
 *
 * @author Timothy
 */
public class MessageService {
    private MessageReceiver reader;
    private MessageSender writer;


    public void setMessageReceiver(MessageReceiver mr) {
        this.reader = mr;
    }
    public void setMessageSender(MessageSender ms) {
        this.writer = ms;
    }

    public void sendMessage() {
        writer.sendMessage(reader.getMessage());
    }
    
}
