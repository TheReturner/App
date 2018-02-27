package com.app.web.config;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = {"com.app.web"})
@EnableWebMvc
public class ApplicationStart extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApplicationStart.class); 
	}
	
	public static void main( String[] args ){	
		SpringApplication application = new SpringApplication(ApplicationStart.class);
		application.setBannerMode(Banner.Mode.LOG);		
		application.run(args);
    }
	
}
