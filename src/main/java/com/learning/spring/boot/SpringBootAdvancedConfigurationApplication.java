package com.learning.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAdvancedConfigurationApplication {

	@Autowired
	private MyMessage myMessage;
	
	@Autowired
	private MyAdvancedConfigurationMessage myAdvancedConfigMessage;
	
	@Autowired
	private MyPropertyInjectedMessage myPropertyInjectedMessage;
	
	@Autowired
	private ApplicationArguments args;
	
	@RequestMapping ("/")
	public String welcome () {
//		return String.format("Welcome, Your Lucky number : %d, your API Key : %s", 
//				myMessage.getRandomNumber(), 
//				myMessage.getMyMessage());
		
//		return String.format("Welcome, Your Lucky number : %d, your API Key : %s", 
//				myAdvancedConfigMessage.getRandomNumber(), 
//				myAdvancedConfigMessage.getMyMessage());
		
//		return String.format("Welcome, Your Lucky number : %d, your API Key : %s", 
//				myPropertyInjectedMessage.getRandomNumber(), 
//				myPropertyInjectedMessage.getMyMessage());
		
		return String.format("Welcome, Your API Key : %s", 
				args.getOptionNames().iterator().next());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvancedConfigurationApplication.class, args);
	}
}
