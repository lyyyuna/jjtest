package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.injection.service.InjectionService;

public class App1
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-injection.xml");
        InjectionService injectionService = (InjectionService)context.getBean("injectionService");
        injectionService.say("hello");
    }
}
