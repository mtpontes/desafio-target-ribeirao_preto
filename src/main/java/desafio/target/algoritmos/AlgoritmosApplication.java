package desafio.target.algoritmos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import desafio.target.algoritmos.service.CLI;

@SpringBootApplication
public class AlgoritmosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgoritmosApplication.class, args);

		new CLI().showMenu();
	}
}