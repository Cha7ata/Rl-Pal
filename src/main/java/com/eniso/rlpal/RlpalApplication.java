package com.eniso.rlpal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RlpalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RlpalApplication.class, args);
	}

}
