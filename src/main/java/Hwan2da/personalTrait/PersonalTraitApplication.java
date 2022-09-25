package Hwan2da.personalTrait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PersonalTraitApplication {
	public static final String APPLICATION_LOCATION = "spring.config.location=" +
			"classpath:application.properties";

	public static void main(String[] args) {
		new SpringApplicationBuilder(PersonalTraitApplication.class)
				.properties(APPLICATION_LOCATION)
				.run(args);
	}

}
