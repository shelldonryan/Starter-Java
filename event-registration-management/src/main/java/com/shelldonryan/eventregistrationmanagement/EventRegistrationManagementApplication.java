package com.shelldonryan.eventregistrationmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EventRegistrationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventRegistrationManagementApplication.class, args);
	}

}
