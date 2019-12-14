package com.javatechie.cloud.stream.api.subscriber;

import com.javatechie.cloud.stream.api.domain.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private Logger log = LoggerFactory.getLogger(MessageConsumer.class);
/*
    @StreamListener("input")
    public void consumeMessage(Book book) {
        log.info("consume message {}", book);
    }*/

}
