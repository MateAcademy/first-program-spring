package ua.klunniy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.spring.controller.MusicPlayer;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.setVolume(50);
//        System.out.println(musicPlayer1.getVolume());
//
//        System.out.println(musicPlayer2.getVolume());
//
//        boolean rez = musicPlayer1 == musicPlayer2;
//        System.out.println("rez = " + rez);

        context.close();
    }

}
