package com.learning.spring.boot;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Set<String> argNames = args.getOptionNames();
		for (String arg : argNames) {
			System.out.println(arg + " : " + args.getOptionValues(arg));
		}
	}
}
