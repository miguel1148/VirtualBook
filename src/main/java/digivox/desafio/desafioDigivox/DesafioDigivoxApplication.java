package digivox.desafio.desafioDigivox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="digivox.desafio.model")
public class DesafioDigivoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDigivoxApplication.class, args);
	}

}
