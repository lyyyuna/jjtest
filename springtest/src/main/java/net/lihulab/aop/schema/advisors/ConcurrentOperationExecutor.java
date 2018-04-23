package net.lihulab.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;

public class ConcurrentOperationExecutor {
    private int maxRetries;
    private int order;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        RuntimeException e;
        do {
            numAttempts ++;
            System.out.println("Try times " + numAttempts);
            try {
                return pjp.proceed();
            } catch (RuntimeException ex){
                e = ex;
            }
        } while (numAttempts <= maxRetries);
        System.out.println("Throws a error");
        return e;
    }
}