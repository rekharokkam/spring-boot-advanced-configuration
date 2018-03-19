package com.learning.spring.boot;

import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;

//@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
