package org.example;

import sun.applet.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        EmailService es = new EmailService();
        MainApplication mp = new MainApplication(es);
        mp.processMessages("Hello world", "baddi@baddiyousssef.com");
    }
}
