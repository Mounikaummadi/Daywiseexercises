package com.wipro.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring.beans.*;

public class App02 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App02.class);
        ((AnnotationConfigApplicationContext) ctx).scan("com.wipro.sprindgdemo.*");
        Mobile mobile = ctx.getBean(Mobile.class);
        System.out.println(mobile);
    }
}
