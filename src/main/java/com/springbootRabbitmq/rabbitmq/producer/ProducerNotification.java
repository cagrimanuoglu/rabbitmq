package com.springbootRabbitmq.rabbitmq.producer;

import java.util.Date;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.springbootRabbitmq.rabbitmq.model.Notification;

@Service
public class ProducerNotification {
	
	@Value("${sr.rabbit.routing.name}")
	private String routingName;

	@Value("${sr.rabbit.exchange.name}")
	private String exchangeName;
	
	@PostConstruct
	public void init()
	{	
		Notification notification = new Notification();
		notification.setNotificationid(UUID.randomUUID().toString());
		notification.setCreatedAt(new Date());
		notification.setMessage("naber nasılsın hos geldin");
		notification.setSeen(Boolean.FALSE);
		
		
		sendToQueue(notification);
	}
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	public void sendToQueue(Notification notification)
	{	System.out.println("Notification Send :ID "+notification.getNotificationid());
		rabbitTemplate.convertAndSend(exchangeName,routingName, notification);
	}
	
	

}
