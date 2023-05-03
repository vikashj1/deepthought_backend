package com.vikash.DeepThoughtBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DeepThoughtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepThoughtBackendApplication.class, args);
	}

}
