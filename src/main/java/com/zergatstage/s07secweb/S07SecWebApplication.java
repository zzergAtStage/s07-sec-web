package com.zergatstage.s07secweb;

import com.zergatstage.s07secweb.auth.AuthenticationService;
import com.zergatstage.s07secweb.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.zergatstage.s07secweb.model.UserRole.ADMIN;
import static com.zergatstage.s07secweb.model.UserRole.MANAGER;

@SpringBootApplication
public class S07SecWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(S07SecWebApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()

					.firstName("Admin")
					.lastName("Admin")
					.userEmail("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstName("Admin")
					.lastName("Admin")
					.userEmail("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}
}
