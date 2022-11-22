package com.example.challenge;

import com.example.challenge.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterBean(){

		FilterRegistrationBean registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/custdata/v1/*");
		return registrationBean;
	}


}
