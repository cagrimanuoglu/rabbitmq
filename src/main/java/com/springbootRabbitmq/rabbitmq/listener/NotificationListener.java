package com.springbootRabbitmq.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.springbootRabbitmq.rabbitmq.model.Notification;

@Service
public class NotificationListener {

	@RabbitListener(queues = "cagri-kuyruk")
	public void handleMessage(Notification notification)
	{
		System.out.println(notification.toString());
		
	}
	
}
