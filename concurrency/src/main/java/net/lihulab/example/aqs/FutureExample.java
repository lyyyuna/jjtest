package net.lihulab.example.aqs;

import java.util.concurrent.*;

public class FutureExample {
    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("do something in callable");
            Thread.sleep(5000);
            return "done";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(new MyCallable());
        System.out.println("do something in main");
        Thread.sleep(1000);
        String result = future.get();
        System.out.println("result: " + result);
        service.shutdown();
    }
}
