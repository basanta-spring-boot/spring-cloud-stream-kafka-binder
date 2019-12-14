package com.javatechie.cloud.stream.api.publisher;

import com.javatechie.cloud.stream.api.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagePublisher {
    @Autowired
    private MessageChannel output;

    @PostMapping("/publish")
    public Book publishMessage(@RequestBody Book book) {
        output.send(MessageBuilder.withPayload(book).build());
        return book;
    }
}
