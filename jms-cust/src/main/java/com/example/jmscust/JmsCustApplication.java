package com.example.jmscust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsCustApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsCustApplication.class, args);
	}

}
