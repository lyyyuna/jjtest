package net.lihulab;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.autowiring.AutoWiringService;
import net.lihulab.resource.LihuResource;

public class App3
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-resource.xml");
        LihuResource r = (LihuResource)context.getBean("lihulabResource");
        try {
            r.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
