package codinnator.codinnator.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
asdfsadfdfsdfsaf
@Configuration
@ComponentScan(basePackages = "codinnator.codinnator")
public class AppConfig {

	@Bean
	public Random random() {
		return new Random();
	}
	
	
}
