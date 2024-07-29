package projeto.projeto_santander_dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Minha API", version = "1.0"))

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
