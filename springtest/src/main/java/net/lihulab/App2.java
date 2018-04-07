package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.autowiring.AutoWiringService;

public class App2
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-autowiring.xml");
        AutoWiringService autoWiringService = (AutoWiringService)context.getBean("autoWiringService");
        autoWiringService.say("wooc sama");
    }
}
