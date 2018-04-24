package net.lihulab.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LihuMethodInterceptor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("LihuMethodInterceptor 1 : " + invocation.getMethod().getName() + "     " + invocation.getStaticPart().getClass().getName());
		Object obj = invocation.proceed();
	    System.out.println("LihuMethodInterceptor 2 : " + obj);
		return obj;
    }

}