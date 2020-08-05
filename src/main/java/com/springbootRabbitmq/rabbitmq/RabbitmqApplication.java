package com.springbootRabbitmq.rabbitmq;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootRabbitmq.rabbitmq.model.Notification;
import com.springbootRabbitmq.rabbitmq.producer.ProducerNotification;

@SpringBootApplication
public class RabbitmqApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
		

	}

}
