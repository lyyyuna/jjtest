package net.lihulab.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("xxx")
public class BeanAnnotation {

    public void say(String w) {
        System.out.println("BeanAnnotation: " + w);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation: " + this.hashCode());
    }
}