package io.github.GleicianeKelly.msavaliandocredito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsavaliandocreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsavaliandocreditoApplication.class, args);
	}

}
