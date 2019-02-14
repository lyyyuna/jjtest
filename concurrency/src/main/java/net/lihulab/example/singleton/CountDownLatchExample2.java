package net.lihulab.example.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.CheckedOutputStream;

public class CountDownLatchExample2 {
    private final static int threadCount = 200;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();

        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for (int i=0; i < threadCount; i++) {
            final int threadNum=i;
            exec.execute(()->{
                try {
                    test(threadNum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("finish");
        exec.shutdown();
    }

    private static  void test(int threadNum) throws InterruptedException {
        Thread.sleep(200);
        System.out.println(threadNum);
        Thread.sleep(200);
    }
}
