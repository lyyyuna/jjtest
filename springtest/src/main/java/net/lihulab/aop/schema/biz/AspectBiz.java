package net.lihulab.aop.schema.biz;

public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz biz");
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz Init: " + bizName + "   " + times);
    }
}