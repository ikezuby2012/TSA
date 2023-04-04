package com.wizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WizardApplication.class, args);
		System.out.println(">>>> application is running");
	}

}
