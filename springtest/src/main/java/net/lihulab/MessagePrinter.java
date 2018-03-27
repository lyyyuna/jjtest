package net.lihulab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService s) {
        this.service = s;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}