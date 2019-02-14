package net.lihulab.example.singleton;

public class SIngletonExample3 {

    //
    private SIngletonExample3() {

    }

    private volatile static SIngletonExample3 instance = null;

    public static SIngletonExample3 getInstance() {
        if (instance == null) {
            synchronized (SIngletonExample3.class) {
                if (instance == null) {
                    instance = new SIngletonExample3();
                }
            }
        }
        return instance;
    }
}
