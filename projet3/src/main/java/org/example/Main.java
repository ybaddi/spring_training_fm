public class Main{
    public static void main(String[] strings){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p =ctx.getBean("per", Person.class);
        p.afficher();
    }
}