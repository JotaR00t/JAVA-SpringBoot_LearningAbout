package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Greet greet_hello = (Greet) context.getBean("greet");

        NotificationService NS_hello  = (NotificationService) context.getBean("notificationService");

        UserService US_hello = (UserService) context.getBean("userService");

        System.out.println(greet_hello.greeting());
        System.out.println(NS_hello.notification());
    }
}