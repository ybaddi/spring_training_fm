package org.example;

import java.security.MessageDigestSpi;

public class MainApplication implements Cunsumer{

    private MessageService messageService;

    public MainApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String msg, String rec){
        this.messageService.sendMessage(msg,rec);
    }
}
