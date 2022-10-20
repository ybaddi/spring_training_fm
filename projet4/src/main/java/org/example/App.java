package org.example;

import org.example.models.Personn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Personn p =ctx.getBean("per", Personn.class);
        System.out.println(p);
        Personn p2 =ctx.getBean("per2", Personn.class);
        System.out.println(p2);
    }
}
