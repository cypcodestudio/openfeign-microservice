package com.cypcode.openfeign_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenfeignMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeignMicroserviceApplication.class, args);
	}

}
