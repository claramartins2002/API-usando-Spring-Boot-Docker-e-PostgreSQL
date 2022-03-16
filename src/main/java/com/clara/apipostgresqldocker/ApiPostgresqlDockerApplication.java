package com.clara.apipostgresqldocker;

import com.clara.apipostgresqldocker.Model.AuditoryAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef= "auditorAware")
public class ApiPostgresqlDockerApplication {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new AuditoryAwareImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiPostgresqlDockerApplication.class, args);
	}

}
