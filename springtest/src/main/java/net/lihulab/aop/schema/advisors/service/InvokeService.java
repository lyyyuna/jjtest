package net.lihulab.aop.schema.advisors.service;

import org.springframework.stereotype.Service;

@Service
public class InvokeService {

    public void invoke() {
        System.out.println("Invoke service ....");
    }

    public void invokeException() {
        throw new RuntimeException("");
    }
}