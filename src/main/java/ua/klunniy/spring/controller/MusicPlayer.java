package ua.klunniy.spring.controller;

import ua.klunniy.spring.model.Music;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music m : music) {
            System.out.println(m.getSong());
        }
    }
}
