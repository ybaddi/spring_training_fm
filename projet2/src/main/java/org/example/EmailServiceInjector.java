package org.example;

public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public Cunsumer getCunsumer() {
        return new MainApplication(new EmailService());
    }
}
