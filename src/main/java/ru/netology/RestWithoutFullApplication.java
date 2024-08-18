package ru.netology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = "ru.netology")
public class RestWithoutFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithoutFullApplication.class, args);
	}

}
