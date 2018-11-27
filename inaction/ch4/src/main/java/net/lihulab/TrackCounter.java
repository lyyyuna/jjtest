package net.lihulab;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* net.lihulab.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {

    }

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount+1);
    }

    public int getPlayCount(int trackNumber) {
        if (trackCounts.containsKey(trackNumber)) {
            return trackCounts.get(trackNumber);
        } else {
            return 0;
        }
    }
}
