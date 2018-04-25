package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.aop.api.BizLogic;
import net.lihulab.aop.aspectj.biz.LihuBiz;
import net.lihulab.aop.schema.advisors.service.InvokeService;


public class App9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-aspectj.xml");
		LihuBiz biz = (LihuBiz)context.getBean("lihuBiz");
		biz.save("this is a test.");
    }
}