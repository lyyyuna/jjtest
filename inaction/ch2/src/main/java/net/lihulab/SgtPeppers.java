package net.lihulab;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "sgt";
    private String artist = "pepper";
    public void play() {
        System.out.println("playing " + title + " " + artist);
    }
}
