package org.example;

import org.example.configuration.AppliocationConfiguration;
import org.example.models.Personn;
import org.example.nation.European;
import org.example.nation.French;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppliocationConfiguration.class);
        Personn per = ctx.getBean("per", Personn.class);
        System.out.println(per);
        Personn per2 = ctx.getBean("per", Personn.class);
        System.out.println(per2);
        European eu = ctx.getBean("francais", French.class);
        System.out.println(eu);
        European eu1 = ctx.getBean("francais", French.class);
        System.out.println(eu1);
    }
}
