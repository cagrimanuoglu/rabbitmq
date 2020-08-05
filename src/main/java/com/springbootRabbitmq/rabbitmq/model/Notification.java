package com.springbootRabbitmq.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
	
	private String notificationid;
	private Date createdAt;
	private Boolean seen;
	private String message;
	
	
	
	
	
	
	public String getNotificationid() {
		return notificationid;
	}
	public void setNotificationid(String notificationid) {
		this.notificationid = notificationid;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Boolean getSeen() {
		return seen;
	}
	public void setSeen(Boolean seen) {
		this.seen = seen;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Notification [notificationid=" + notificationid + ", createdAt=" + createdAt + ", seen=" + seen
				+ ", message=" + message + "]";
	}
	
	
	
	
	
	
	
	
	

}
