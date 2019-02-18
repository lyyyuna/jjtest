package net.lihulab.example.rateLimiter;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

public class RateLimiterExample1 {
    private static RateLimiter ratelimiter = RateLimiter.create(5);

    public static void main(String[] args) {
        for (int index = 0; index < 100; index++) {
            if (ratelimiter.tryAcquire(1, 199, TimeUnit.MILLISECONDS)) {
                handle(index);
            }
        }
    }

    public static void handle(int index){
        System.out.println(index);
    }
}
