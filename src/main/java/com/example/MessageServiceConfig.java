package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageServiceConfig {
    @Bean
    public MessageService messageService(){
        return new MyNameMessageService();
    }

    @Bean
    public MessageService additionMessageService(){
        return new RandomTextMessageService();
    }
}
