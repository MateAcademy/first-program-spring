package ua.klunniy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Music;
import ua.klunniy.spring.model.impl.ClassicalMusic;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;

//    private List<Music> music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

//    public static MusicPlayer getInstance() {
//        System.out.println("мы в конструкторе MusicPlayer");
//        return new MusicPlayer();
//    }

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

//    public List<Music> getMusic() {
//        return music;
//    }
//
//    public void setMusic(List<Music> music) {
//        this.music = music;
//    }

    public void playMusic() {
//        for (Music m : music) {
//            System.out.println(m.getSong());
//        }
        System.out.println(classicalMusic.getSong());
    }
}
