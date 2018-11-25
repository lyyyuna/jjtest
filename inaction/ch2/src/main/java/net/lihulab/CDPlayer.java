package net.lihulab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public void CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        this.cd.play();
    }
}
