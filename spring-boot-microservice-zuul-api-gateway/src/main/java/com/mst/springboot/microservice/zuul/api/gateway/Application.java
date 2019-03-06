package com.mst.springboot.microservice.zuul.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	 @Bean

	 public UserDetailsService userDetailsService() {

	  @SuppressWarnings("deprecation")
	UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")

	   .build();

	  return new InMemoryUserDetailsManager(user);

	 }

}
