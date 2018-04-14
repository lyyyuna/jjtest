package net.lihulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.aop.schema.biz.AspectBiz;
import net.lihulab.beanannotation.BeanAnnotation;
import net.lihulab.beanannotation.multibean.BeanInvoker;

public class App5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-schema-advisor.xml");
        AspectBiz biz = (AspectBiz)context.getBean("aspectBiz");
        biz.biz();
        biz.init("lalala", 9);
    }
}