package net.lihulab.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LihuBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] agrs, Object target) throws Throwable{
		System.out.println("LihuBeforeAdvice : " + method.getName() + "     " + 
				 target.getClass().getName());
    }
}