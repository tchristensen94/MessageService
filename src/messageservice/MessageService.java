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
    private MessageReceiver mr;
    private MessageSender ms;


    public void setMessageReceiver(MessageReceiver mr) {
        this.mr = mr;
    }
    public void setMessageSender(MessageSender ms) {
        this.ms = ms;
    }

    public void sendMessage() {
        ms.sendMessage(mr);
    }
    
}
