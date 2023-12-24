package ua.klunniy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getText());

    }

}
