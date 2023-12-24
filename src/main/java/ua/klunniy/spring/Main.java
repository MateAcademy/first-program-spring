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

        context.close();
    }

}
