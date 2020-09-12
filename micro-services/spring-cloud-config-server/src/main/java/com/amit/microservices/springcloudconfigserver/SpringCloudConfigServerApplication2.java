package com.amit.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication2.class, args);
	}

}
