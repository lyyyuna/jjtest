package net.lihulab;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 1. 创建执行线程的方式三：实现 Callable 接口
 *
 * 2. 执行 callable 方式，需要 futuretask 实现类的支持，用于
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        ThreadDemo td = new ThreadDemo();

        FutureTask<Integer> ft = new FutureTask<>(td);

        new Thread(ft).start();

        Integer sum = ft.get();
        System.out.println(sum);
    }
}

class ThreadDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        int sum = 0;
        for (int i=0; i<=100; i++) {
            sum += i;
        }

        return sum;

    }
}
