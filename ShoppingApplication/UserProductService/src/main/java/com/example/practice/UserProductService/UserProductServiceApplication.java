package com.example.practice.UserProductService;

import com.example.practice.UserProductService.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProductServiceApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterBeand(){
		FilterRegistrationBean filterreg = new FilterRegistrationBean();
		filterreg.setFilter(new JwtFilter());
		filterreg.addUrlPatterns("/userproduct/app/addproduct/*");
		return filterreg;
	}
}
