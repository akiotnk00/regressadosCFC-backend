package com.regressados.regressadosCFC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.regressados.regressadosCFC.*" })
@EnableJpaRepositories
@SpringBootApplication
public class RegressadosCfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegressadosCfcApplication.class, args);
	}
	

}
