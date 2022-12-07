package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("additionalMessageService")
public class RandomTextMessageService implements MessageService {
    private final String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4",
            "Message 5", "Message 6", "Message 7", "Message 8", "Message 9", "Message 10"
    };

    @Override
    public String getMessage() {
        return messages[new  Random().nextInt(10)];
    }
}
