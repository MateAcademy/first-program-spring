package ua.klunniy.spring.controller;

import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(this.music.getSong());
    }
}