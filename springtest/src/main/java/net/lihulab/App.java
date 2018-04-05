package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_ioc.xml");
        OneInterface oneInterface = (OneInterface)context.getBean("oneInterface");
        oneInterface.say("hello");
    }
}
