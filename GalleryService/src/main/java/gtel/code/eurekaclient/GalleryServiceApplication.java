package gtel.code.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class GalleryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryServiceApplication.class, args);
	}

	@Configuration
	static
	class RestTemplateConfig {

		// Create a bean for restTemplate to call services
		@Bean
		@LoadBalanced // Load balance between service instances running at different ports.
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}


}
