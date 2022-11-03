package org.example;


import org.example.models.Person;
import org.example.nation.English;
import org.example.nation.European;
import org.example.nation.French;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
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
        BeanFactory factory = (BeanFactory)ctx;
        European eu = (English) factory.getBean("english");
        eu.saluer();

        Person p = (Person) factory.getBean("person");
        p.drive();;

    }
}
