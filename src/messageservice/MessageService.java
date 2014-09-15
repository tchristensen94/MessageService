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
    private MessageReader reader;
    private MessageSender writer;

    public MessageService(MessageReader reader, MessageSender writer) {
        this.reader = reader;
        this.writer = writer;
    }


    public void setMessageReceiver(MessageReader mr) {
        this.reader = mr;
    }
    public void setMessageSender(MessageSender ms) {
        this.writer = ms;
    }
    public MessageReader getReader() {
        return reader;
    }
    public MessageSender getWriter() {
        return writer;
    }

    public void processMessage() {
        writer.writeMessage(reader.readMessage());
}

}
