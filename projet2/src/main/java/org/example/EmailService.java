package org.example;

public class EmailService implements MessageService{
    public void sendMessage(String message, String receiver){
        // TODO
        System.out.println("Email sent to " + receiver + " with message " + message);
    }
}
