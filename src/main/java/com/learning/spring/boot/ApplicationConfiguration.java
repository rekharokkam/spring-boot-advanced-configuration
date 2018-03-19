package com.learning.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {

	@Bean
//	@Profile ("prod")
	public MyAdvancedConfigurationMessage myAdvancedConfigurationMessage (
			@Value ("${my.advancedConfigurationMessage}") String message,
			@Value("${my.advancedConfigurationNumber}") int number) {
		MyAdvancedConfigurationMessage myAdvancedConfigurationMessageObj = new MyAdvancedConfigurationMessage();
		myAdvancedConfigurationMessageObj.setMyMessage(message);
		myAdvancedConfigurationMessageObj.setRandomNumber(number);
		return myAdvancedConfigurationMessageObj;
	}
	
//	@Bean
//	@Profile("dev")
//	public MyAdvancedConfigurationMessage myAdvancedConfigurationMessageDev () {
//		MyAdvancedConfigurationMessage myAdvancedConfigurationMessageObj = new MyAdvancedConfigurationMessage();
//		myAdvancedConfigurationMessageObj.setMyMessage("Static Message from dev profile");
//		myAdvancedConfigurationMessageObj.setRandomNumber(100);
//		return myAdvancedConfigurationMessageObj;
//	}

}
