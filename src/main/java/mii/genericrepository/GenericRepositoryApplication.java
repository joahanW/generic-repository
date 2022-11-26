package mii.genericrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericRepositoryApplication.class, args);
                System.out.println("Generic Pattern is Running...");
	}

}
