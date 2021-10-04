package com.msaccess.AccessBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AccessBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessBackendApplication.class, args);
	}

}
