package net.lihulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.lihulab.beanannotation.BeanAnnotation;
import net.lihulab.beanannotation.multibean.BeanInvoker;

public class App4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beanannotation.xml");
        BeanAnnotation bean = (BeanAnnotation)context.getBean("xxx");
        bean.say("hello.");

        // test scope related
        bean.myHashCode();
        BeanAnnotation bean2 = (BeanAnnotation)context.getBean("xxx");
        bean2.myHashCode();

        // multibean
        BeanInvoker bean3 = (BeanInvoker)context.getBean("beanInvoker");
        bean3.say();
    }
}