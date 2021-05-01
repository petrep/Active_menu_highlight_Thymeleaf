package com.codeforgeyt.springmvcnav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringMvcNavApplication extends SpringBootServletInitializer {

	@Transactional
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcNavApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringMvcNavApplication.class);
	}
}
