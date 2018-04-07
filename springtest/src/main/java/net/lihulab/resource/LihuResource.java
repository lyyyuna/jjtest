package net.lihulab.resource;

import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;


public class LihuResource implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.applicationContext = context;
    }

    public void resource() throws IOException {
        Resource resource = applicationContext.getResource("spring_ioc.xml");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}