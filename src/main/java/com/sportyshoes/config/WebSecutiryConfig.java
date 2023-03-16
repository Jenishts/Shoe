package com.sportyshoes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;



@Configuration
@EnableWebSecurity
public class WebSecutiryConfig{

    @Autowired
    private UserDetailsService userDetailsService;

    private static final String[] WHITE_LIST_URLS={

            "/adduser",
            "/registeruser"
    };

    private static final String[] ADMIN_WHITE_LIST_URLS={

            "/add",
            "/delete/**"
    };



    @Bean
    AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider
                = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return  provider;
    }


    @Bean
    PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder(11);
    }



    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http
                .cors()
                .and()
                .csrf()
                .disable()

                .authorizeRequests()
                .requestMatchers(WHITE_LIST_URLS)
                .permitAll()
                .requestMatchers("/list")
                .hasAuthority("USER")
                .requestMatchers(ADMIN_WHITE_LIST_URLS)
                .hasAuthority("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

        return http.build();
    }
}
