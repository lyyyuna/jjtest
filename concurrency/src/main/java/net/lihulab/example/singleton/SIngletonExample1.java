package net.lihulab.example.singleton;

import javax.swing.*;

public class SIngletonExample1 {

    //
    private SIngletonExample1() {

    }

    private static SIngletonExample1 instance = null;

    public static SIngletonExample1 getInstance() {
        if (instance == null) {
            instance = new SIngletonExample1();
        }
        return instance;
    }
}
