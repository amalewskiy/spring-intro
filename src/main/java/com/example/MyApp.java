package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext additionalApplicationContext = new ClassPathXmlApplicationContext("additionalApplicationContext.xml");

        MessageService messageService = additionalApplicationContext.getBean("messageService", MessageService.class);
        MessageService additionalMessageService = additionalApplicationContext.getBean("additionalMessageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(additionalMessageService.getMessage());
        additionalApplicationContext.close();

        ApplicationContext javaConfigApplicationContext = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService javaConfigMessageService = javaConfigApplicationContext.getBean(MyNameMessageService.class);
        MessageService javaConfigAdditionalMessageService = javaConfigApplicationContext.getBean(RandomTextMessageService.class);

        System.out.println(javaConfigMessageService.getMessage());
        System.out.println(javaConfigAdditionalMessageService.getMessage());
    }
}
