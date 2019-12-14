package com.javatechie.cloud.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Sink.class})
public class CloudStreamConsumerApplication {


	private Logger log = LoggerFactory.getLogger(CloudStreamConsumerApplication.class);

	@StreamListener("input")
	public void consumeMessage(Book book) {
		log.info("consume message {}", book);
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamConsumerApplication.class, args);
	}

}
