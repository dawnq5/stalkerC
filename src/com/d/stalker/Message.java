package com.d.stalker;

import java.util.Date;

public class Message {
	private String formUser;
	private String toUser;
	private Date time;
	private String message;
	private String flag;
	public String getFormUser() {
		return formUser;
	}
	public void setFormUser(String formUser) {
		this.formUser = formUser;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	
	

}
