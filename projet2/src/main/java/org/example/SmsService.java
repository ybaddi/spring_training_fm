package org.example;

public class SmsService implements MessageService{
    public void sendMessage(String message, String receiver){
        // TODO
        System.out.println("Sms sent to " + receiver + " with message " + message);
    }
}
