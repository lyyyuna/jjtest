package net.lihulab.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
public class AysncController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/order")
    public Callable<String> order() {
        logger.info("thread begin.");

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                logger.info("sub-thread begin.");
                Thread.sleep(2000);
                logger.info("sub-thread end.");
                return "success";
            }
        };

        logger.info("thread end.");
        return callable;

    }
}
