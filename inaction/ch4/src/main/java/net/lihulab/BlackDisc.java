package net.lihulab;

import java.util.List;

public class BlackDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("playing " + title  + " artist is " + artist);
        for (int i=0; i < tracks.size(); i++) {
            playTrack(i);
        }
    }

    public void playTrack(int track) {
        System.out.println("-Track: " + tracks.get(track));
    }
}
