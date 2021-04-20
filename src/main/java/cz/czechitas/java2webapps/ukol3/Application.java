package cz.czechitas.java2webapps.ukol3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hlavní třída, která spouští celou aplikaci pomocí Spring Boot.
 */

//		musím sem dát komentář, protože nejde git
@SpringBootApplication
public class Application {

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}

}
