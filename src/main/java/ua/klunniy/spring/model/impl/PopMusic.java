package ua.klunniy.spring.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
@Component("musicBean2")
public class PopMusic implements Music {
    @Value("${popMusic.id}")
    private int id;
    private String text;

    private PopMusic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getSong() {
        System.out.println("id=" + id + ", text=" + text);
        return "поп песня\n";
    }
}
