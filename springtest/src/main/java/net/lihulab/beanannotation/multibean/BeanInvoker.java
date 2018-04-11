package net.lihulab.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface bean;

    public void say() {
        for (BeanInterface b: list) {
            System.out.println(b.getClass().getName());
        }
        System.out.println();

        for (Map.Entry<String, BeanInterface> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue().getClass().getName());
        }
        System.out.println();

        System.out.println(bean.getClass().getName());
    }
}