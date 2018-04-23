package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.aop.schema.advisors.service.InvokeService;


public class App7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-schema-advisors.xml");
		InvokeService service = (InvokeService)context.getBean("invokeService");
		service.invoke();
		
		System.out.println();
		service.invokeException();
    }
}