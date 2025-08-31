package com.wipro.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wipro.spring.beans.*;

public class App01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        College college =context.getBean(College.class);
        System.out.println(college);
    }
}
