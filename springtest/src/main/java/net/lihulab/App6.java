package net.lihulab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.aop.schema.FitInte;
import net.lihulab.aop.schema.biz.AspectBiz;

public class App6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-schema-advisor.xml");
        FitInte fit = (FitInte)context.getBean("aspectBiz");
        fit.filter();
    }
}