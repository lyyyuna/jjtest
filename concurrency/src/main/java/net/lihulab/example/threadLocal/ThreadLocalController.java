package net.lihulab.example.threadLocal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadLocalController {

    @GetMapping
    public Long test() {
        return RequestHolder.getId();
    }
}
