package com.mycompany.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configuration
//@EnableWebSecurity
//@ComponentScan("com.mycompany.config")
public class SecurityConfig {

	
//	@Bean
//	public UserDetailsService UserDetailsService(){
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//		String password = passwordEncoder().encode("password");
//		manager.createUser(User.withUsername("admin").password(password).roles("user").build());
//		return manager; 
//	}
	
//	@Bean
//	public  NoOpPasswordEncoder passwordEncoder() {
//		// TODO Auto-generated method stub
//		return (NoOpPasswordEncoder)NoOpPasswordEncoder.getInstance();
//	}
//
//	@Override
//	public void configure(HttpSecurity http) throws Exception{
//		http.authorizeRequests().anyRequest().authenticated();
//		
//	}
}
