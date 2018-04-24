package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.aop.api.BizLogic;
import net.lihulab.aop.schema.advisors.service.InvokeService;


public class App8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-api.xml");
		BizLogic logic = (BizLogic)context.getBean("bizLogicImpl");
		logic.save();
    }
}