package com.playnd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.servlet.support.csrf.CsrfRequestDataValueProcessor;
import org.springframework.web.servlet.support.RequestDataValueProcessor;

/**
 * Created by Bae B K on 2018. 6. 27.
 */
@Configuration
public class AppConfig {
    @Bean
    public CsrfFilter csrfFilter() {
        return new CsrfFilter(new HttpSessionCsrfTokenRepository());
    }
    
    @Bean
    public RequestDataValueProcessor requestDataValueProcessor() {
        return new CsrfRequestDataValueProcessor();
    }
}
