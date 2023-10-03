package br.com.api.v1.presentes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiPresentesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPresentesApplication.class, args);
	}

}
