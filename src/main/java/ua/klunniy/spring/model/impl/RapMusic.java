package ua.klunniy.spring.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
@Component("musicBean3")
public class RapMusic implements Music {

    @Value("${rapMusic.id}")
    private int id;

    @Value("${rapMusic.text}")
    private String text;

    private RapMusic() {
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
        return "песня rap музыки\n";
    }
}
