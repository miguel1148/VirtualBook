package digivox.desafio.desafioDigivox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="digivox.desafio.model")
@ComponentScan(basePackages="digivox.*")
@EnableJpaRepositories(basePackages = {"digivox.desafio.repository"})
@EnableTransactionManagement
public class DesafioDigivoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDigivoxApplication.class, args);
	}

}
