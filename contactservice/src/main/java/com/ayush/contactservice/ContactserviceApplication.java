package com.ayush.contactservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ContactserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactserviceApplication.class, args);
	}

}
