package ua.klunniy.spring;

/**
 * @author Serhii Klunniy
 */
public class TestBean {
    private String text = "hillel";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TestBean(String text) {
        this.text = text;
    }

    public TestBean() {
    }
}
