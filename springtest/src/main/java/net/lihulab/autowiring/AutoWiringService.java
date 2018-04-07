package net.lihulab.autowiring;

public class AutoWiringService {
    private AutoWiringDao autoWiringDao;

    public AutoWiringService(AutoWiringDao autoWiringDao) {
        System.out.println("It is constuctor called.");
        this.autoWiringDao = autoWiringDao;
    }
    
    public void setAutoWiringService(AutoWiringDao a) {
        this.autoWiringDao = a;
    }

    public void say(String s) {
        this.autoWiringDao.say(s);
    }
}