package ua.klunniy.spring.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
@Component("musicBean1")
public class ClassicalMusic implements Music {
    @Value("${classicalMusic.id}")
    private int id;

    @Value("${classicalMusic.text}")
    private String text;

    private ClassicalMusic() {
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
        return "классическая песня\n";
    }
}
