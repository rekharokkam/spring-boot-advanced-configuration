package com.learning.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {

	@Value ("${myMessage}")
	private String myMessage;

	@Value ("${myNumber}")
	private int randomNumber;
	
	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
}
