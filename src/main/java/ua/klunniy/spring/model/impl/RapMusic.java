package ua.klunniy.spring.model.impl;

import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "песня rap музыки";
    }
}
