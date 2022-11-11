package com.example.projet16.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    protected UserDetailsService userDetailsService(){
        List<UserDetails> users = new ArrayList<>();
        users.add(User.withDefaultPasswordEncoder()
                .username("baddi").password("baddiroot")
                .roles("USER").build());
        users.add(User.withDefaultPasswordEncoder()
                .username("admin").password("adminroot")
                .roles("USER").build());
        users.add(User.withDefaultPasswordEncoder()
                .username("adil").password("adilroot")
                .roles("USER").build());

        return new InMemoryUserDetailsManager(users);
    }

//    public AuthenticationProvider authProvider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        return provider;
//    }
}
